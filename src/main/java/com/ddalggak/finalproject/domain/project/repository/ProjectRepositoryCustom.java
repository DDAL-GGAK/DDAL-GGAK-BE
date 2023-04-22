package com.ddalggak.finalproject.domain.project.repository;

import java.util.List;
import java.util.Optional;

import com.ddalggak.finalproject.domain.project.dto.ProjectBriefResponseDto;
import com.ddalggak.finalproject.domain.project.dto.ProjectRequestDto;
import com.ddalggak.finalproject.domain.project.entity.Project;

public interface ProjectRepositoryCustom {

	List<ProjectBriefResponseDto> findProjectAllByUserId(Long userId);

	Optional<Project> findProjectByTaskId(Long taskId);

	void update(Long projectId, ProjectRequestDto projectRequestDto);

}
