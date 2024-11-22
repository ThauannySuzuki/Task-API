package br.com.api.task.mapper

import br.com.api.task.dto.CriarTask
import br.com.api.task.dto.VizualizarTask
import br.com.api.task.entity.TaskEntity
import org.mapstruct.Mapper
import org.mapstruct.MappingConstants
import org.mapstruct.ReportingPolicy

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
interface TaskMapper {

    fun dtoToEntity(criarTask: CriarTask): TaskEntity
    fun entityToDto(taskEntity: TaskEntity): CriarTask

    fun dtoViewToEntity(vizualizarTask: VizualizarTask): TaskEntity
    fun entityToDtoView(taskEntity: TaskEntity): VizualizarTask
}