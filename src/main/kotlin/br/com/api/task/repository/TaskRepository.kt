package br.com.api.task.repository

import br.com.api.task.entity.TaskEntity
import org.springframework.data.jpa.repository.JpaRepository

interface TaskRepository : JpaRepository<TaskEntity, Int> {
}