package br.com.api.task.controller

import br.com.api.task.dto.CriarTask
import br.com.api.task.dto.VizualizarTask
import br.com.api.task.mapper.TaskMapper
import br.com.api.task.repository.TaskRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("task")
class TaskController (private val taskMapper: TaskMapper, private val taskRepository: TaskRepository) {

    @PostMapping
    fun criarTask(@RequestBody taskBody : CriarTask): VizualizarTask{
        val task = taskMapper.dtoToEntity(taskBody)
        val taskNew = taskRepository.save(task)
        val taskView = taskMapper.entityToDtoView(taskNew)
        return taskView
    }

    @GetMapping
    fun listarTask(): String{
        return ""
    }
}