package com.ddalggak.finalproject.domain.project.service;

import static com.ddalggak.finalproject.global.error.ErrorCode.*;
import static org.springframework.http.ResponseEntity.*;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.ddalggak.finalproject.domain.project.dto.ProjectBriefResponseDto;
import com.ddalggak.finalproject.domain.project.dto.ProjectMapper;
import com.ddalggak.finalproject.domain.project.dto.ProjectRequestDto;
import com.ddalggak.finalproject.domain.project.dto.ProjectResponseDto;
import com.ddalggak.finalproject.domain.project.dto.ProjectUserRequestDto;
import com.ddalggak.finalproject.domain.project.entity.Project;
import com.ddalggak.finalproject.domain.project.entity.ProjectUser;
import com.ddalggak.finalproject.domain.project.repository.ProjectRepository;
import com.ddalggak.finalproject.domain.task.dto.TaskSearchCondition;
import com.ddalggak.finalproject.domain.user.dto.UserMapper;
import com.ddalggak.finalproject.domain.user.dto.UserResponseDto;
import com.ddalggak.finalproject.domain.user.entity.User;
import com.ddalggak.finalproject.domain.user.exception.UserException;
import com.ddalggak.finalproject.domain.user.repository.UserRepository;
import com.ddalggak.finalproject.global.error.CustomException;
import com.ddalggak.finalproject.global.error.ErrorCode;
import com.ddalggak.finalproject.global.mail.MailService;
import com.ddalggak.finalproject.infra.aws.S3Uploader;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@RequiredArgsConstructor
@Aspect
@Component
public class ProjectService {
	private final ProjectMapper projectMapper;
	private final UserMapper userMapper;
	private final ProjectRepository projectRepository;
	private final S3Uploader s3Uploader;
	private final UserRepository userRepository;
	private final MailService mailService;

	@Value("${file.size.limit}")
	private Long fileSizeLimit;//10메가바이트/킬로바이트/바이트

	@Transactional
	public ResponseEntity<List<ProjectBriefResponseDto>> createProject(User user, MultipartFile image,
		ProjectRequestDto projectRequestDto) throws
		IOException {
		//1. user로 projectUserRequestDto 생성
		ProjectUserRequestDto projectUserRequestDto = ProjectUserRequestDto.create(user);
		//2. projectUserDto로 projectUser생성
		ProjectUser projectUser = ProjectUser.create(projectUserRequestDto);
		//2.5 image S3 서버에 업로드 -> 분기처리
		String imageUrl = null;
		if (image != null) {
			fileCheck(image);
			fileSizeCheck(image);
			imageUrl = s3Uploader.upload(image, "project");
		}
		projectRequestDto.setThumbnail(imageUrl);
		//3. projectUser로 project생성
		Project project = Project.create(projectRequestDto, projectUser);
		project.setInviteCode(UUID.randomUUID().toString());
		//4. projectRepository에 project 저장
		projectRepository.save(project);
		//5. projectResponseDto로 반환
		List<ProjectBriefResponseDto> result = projectRepository.findProjectAllByUserId(user.getUserId());
		return ResponseEntity.status(201)
			.body(result);
	}

	@Transactional(readOnly = true)
	public ResponseEntity<List<ProjectBriefResponseDto>> viewProjectAll(User user) {
		List<ProjectBriefResponseDto> result = projectRepository.findProjectAllByUserId(user.getUserId());
		return ok(result);
	}

	//프로젝트 확인
	@Transactional(readOnly = true)
	public ResponseEntity<ProjectResponseDto> viewProject(User user, Long id) {
		// 유효성 검증
		Project project = validateProject(id);
		validateExistMember(project, ProjectUser.create(project, user));

		// 리턴
		ProjectResponseDto projectResponseDto = projectMapper.toDto(project);

		return ok(projectResponseDto);
	}

	@Transactional
	public ResponseEntity<List<ProjectBriefResponseDto>> deleteProject(User user, Long projectId) {
		Project project = validateProject(projectId);
		if (project.getProjectLeader().equals(user.getEmail())) {
			if (project.getThumbnail() != null) {
				s3Uploader.delete(project.getThumbnail());
			}
			projectRepository.delete(project);
			List<ProjectBriefResponseDto> result = projectRepository.findProjectAllByUserId(
				user.getUserId());
			return ok(result);
		} else {
			throw new CustomException(ErrorCode.UNAUTHENTICATED_USER);
		}
	}

	@Transactional
	public ResponseEntity<List<ProjectBriefResponseDto>> joinProject(User user,
		String projectInviteCode) {
		// 유효성 검사
		Project project = projectRepository.findByUuid(projectInviteCode).orElseThrow(
			() -> new CustomException(INVALID_INVITE_CODE));
		ProjectUser projectUser = ProjectUser.create(project, user);
		validateDuplicateMember(project, projectUser);
		// 프로젝트에 user 추가
		project.addProjectUser(projectUser);
		projectRepository.save(project);
		List<ProjectBriefResponseDto> result = projectRepository.findProjectAllByUserId(
			user.getUserId());
		return ok(result);
	}

	// 프로젝트 정보 변경
	@Transactional
	public ResponseEntity<List<ProjectBriefResponseDto>> updateProject(User user, Long projectId,
		MultipartFile image, ProjectRequestDto projectRequestDto) throws IOException {
		// 유효성 검사
		Project project = validateProject(projectId);
		if (!project.getProjectLeader().equals(user.getEmail())) {
			throw new CustomException(ErrorCode.UNAUTHENTICATED_USER);
		}
		String imageUrl = null;
		if (image != null) {
			fileCheck(image);
			fileSizeCheck(image);
			// 기존 이미지 삭제 후 새로운 이미지 업로드
			if (project.getThumbnail() != null) {
				s3Uploader.delete(project.getThumbnail());
			}
			imageUrl = s3Uploader.upload(image, "project");
		}
		projectRequestDto.setThumbnail(imageUrl);
		// 업로드한 이미지의 url을 바탕으로 update 쿼리, dynamic update 기준 업데이트
		project.update(projectRequestDto);
		projectRepository.save(project);

		// 새로운 프로젝트 다시 받아옴
		List<ProjectBriefResponseDto> result = projectRepository.findProjectAllByUserId(
			user.getUserId());
		return ok(result);
	}

	@Transactional
	public ResponseEntity<List<UserResponseDto>> deleteProjectUser(User user, Long projectId, Long userId) {
		// 유효성 검사
		Project project = validateProject(projectId);
		User projectUser = userRepository.findById(userId).orElseThrow(
			() -> new UserException(ErrorCode.EMPTY_CLIENT)
		);
		if (projectUser.getEmail().equals(user.getEmail())) {
			throw new IllegalArgumentException("자기 자신은 내보낼 수 없습니다.");
		} else if (project.getProjectUserList().size() == 1) {
			throw new IllegalArgumentException("빈 프로젝트를 만들 수 없습니다.");
		} else if (!project.getProjectLeader().equals(user.getEmail())) {
			throw new CustomException(ErrorCode.UNAUTHENTICATED_USER);
		}
		project.deleteProjectUser(projectUser);
		projectRepository.save(project);
		// 참여중인 유저 목록 리턴
		List<UserResponseDto> userList = userRepository
			.getProjectUserFromProjectId(projectId)
			.stream()
			.map(userMapper::toUserResponseDtoWithProjectUser)
			.collect(Collectors.toList());
		return ok(userList);
	}

	// 프로젝트에 참여중인 유저 목록 조회
	@Transactional(readOnly = true)
	public ResponseEntity<List<UserResponseDto>> viewProjectUsers(User user, Long projectId,
		TaskSearchCondition condition) {
		// 유효성 검증
		Project project = validateProject(projectId);
		validateExistMember(project, ProjectUser.create(project, user));

		// 참여중인 유저 목록 리턴
		List<UserResponseDto> userList = userRepository
			.getProjectUserWithTaskCondition(projectId, condition)
			.stream()
			.map(userMapper::toUserResponseDtoWithProjectUser)
			.collect(Collectors.toList());
		return ok(userList);
	}

	//초대 코드 생성
	@Transactional
	public ResponseEntity<String> getInviteCode(User user, Long projectId) {
		// 유효성 검증
		Project project = validateProject(projectId);
		validateExistMember(project, ProjectUser.create(project, user));
		if (!project.getProjectLeader().equals(user.getEmail())) {
			throw new CustomException(ErrorCode.UNAUTHENTICATED_USER);
		}
		// projectInviteCode 확인 및 생성
		String projectInviteCode = project.getUuid();

		return ok(projectInviteCode);
	}

	// 프로젝트 사용자 초대
	@Transactional
	public ResponseEntity<List<UserResponseDto>> inviteProjectUser(User user, Long projectId, List<String> emails) {
		// 유효성 검증
		Project project = validateProject(projectId);
		validateExistMember(project, ProjectUser.create(project, user));
		// email 유효성 검증
		Pattern pattern = Pattern.compile("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");
		for (String email : emails) {
			if (!pattern.matcher(email).matches()) {
				throw new CustomException(INVALID_EMAIL);
			}
		}
		// projectInviteCode 확인 및 생성
		String projectInviteCode = project.getUuid();

		// 참여중인 유저 목록 리턴
		List<UserResponseDto> userList = userRepository
			.getProjectUserFromProjectId(projectId)
			.stream()
			.map(userMapper::toUserResponseDtoWithProjectUser)
			.collect(Collectors.toList());
		// 초대 코드 발송 및 회원, 비회원 정보 가져오기
		Map<String, Object> response = mailService.sendProjectInviteCode(projectInviteCode, emails);
		response.put("userResponseDtoList", userList);

		return ok(userList);
	}

	private void validateDuplicateMember(Project project, ProjectUser projectUser) {
		if (project.getProjectUserList().contains(projectUser)) {
			throw new CustomException(ErrorCode.DUPLICATE_MEMBER);
		}
	}

	private void validateExistMember(Project project, ProjectUser projectUser) {
		if (!project.getProjectUserList().contains(projectUser)) {
			throw new CustomException(ErrorCode.UNAUTHENTICATED_USER);
		}
	}

	private Project validateProject(Long id) {
		return projectRepository.findById(id).orElseThrow(
			() -> new CustomException(ErrorCode.PROJECT_NOT_FOUND)
		);
	}

	private void fileCheck(MultipartFile file) {
		String fileName = StringUtils.getFilenameExtension(file.getOriginalFilename());
		if (fileName != null) {
			String exe = fileName.toLowerCase();
			if (!(exe.equals("jpg") || exe.equals("png") || exe.equals("jpeg") || exe.equals("gif") || exe.equals(
				"webp"))) {
				throw new CustomException(ErrorCode.TYPE_MISMATCH);
			}
		}
	}

	private void fileSizeCheck(MultipartFile image) {
		// 파일 용량 확인
		long fileSize = image.getSize();
		if (fileSize > fileSizeLimit) {
			throw new IllegalArgumentException("총 용량 10MB이하만 업로드 가능합니다");
		}
	}

	@Scheduled(fixedRate = 86400000) // 1일마다 갱신
	@Transactional
	public void generateNewProjectInviteCode() {
		List<Project> projects = projectRepository.findAll();
		for (Project project : projects) {
			String newProjectInviteCode = UUID.randomUUID().toString();
			project.setInviteCode(newProjectInviteCode);
			projectRepository.save(project);
		}
	}

}

