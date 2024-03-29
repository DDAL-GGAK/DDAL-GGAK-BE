package com.ddalggak.finalproject.domain.user.dto;

import java.util.List;

import com.ddalggak.finalproject.domain.project.dto.ProjectBriefResponseDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
public class UserPageDto {
	public Long userId;
	public String email;
	public String nickname;
	public String profile;
	public List<ProjectBriefResponseDto> projects;
}
