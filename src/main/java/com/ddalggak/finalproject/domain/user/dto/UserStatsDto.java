package com.ddalggak.finalproject.domain.user.dto;

import com.querydsl.core.annotations.QueryProjection;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class UserStatsDto {
	private Long id;
	private String email;
	private String nickname;
	private String thumbnail;
	private Integer totalDifficulty;
	private Integer totalPriority;
	private Long totalTicketCount;
	private Long completedTicketCount;
	private Double averageDifficulty;
	private Double averagePriority;
	private Double totalScore = 0.0d;
	private Double averageScore = 0.0d;

	@QueryProjection
	public UserStatsDto(Long id, String email, String nickname, String thumbnail) {
		this.id = id;
		this.email = email;
		this.nickname = nickname;
		this.thumbnail = thumbnail;
	}

	public void addScore(double score) {
		totalScore += score;
	}
}
