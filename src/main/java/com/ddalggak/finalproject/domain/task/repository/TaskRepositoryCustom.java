package com.ddalggak.finalproject.domain.task.repository;

import java.util.List;
import java.util.Optional;

import com.ddalggak.finalproject.domain.task.entity.Task;

public interface TaskRepositoryCustom {
	Optional<Task> findTaskById(Long id);

	Optional<Task> findTaskByLabelId(Long labelId);

	List<Task> findTaskByProject(Long projectId);
}
