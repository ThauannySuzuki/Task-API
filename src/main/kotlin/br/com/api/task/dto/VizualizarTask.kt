package br.com.api.task.dto

import br.com.api.task.enums.StatusEnum
import java.time.LocalDateTime

data class VizualizarTask (
    val id:Int,
    val titulo: String,
    val descricao: String,
    val status: StatusEnum,
    val criadoEm: LocalDateTime,
    val atualizadoEm: LocalDateTime
)