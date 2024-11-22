package br.com.api.task.dto

import br.com.api.task.enums.StatusEnum
import java.time.LocalDateTime

data class CriarTask (
    val titulo : String,
    val descricao: String,
    val status: StatusEnum = StatusEnum.PENDENTE,
    val criadoEm: LocalDateTime = LocalDateTime.now(),
    val atualizadoEm: LocalDateTime = LocalDateTime.now()
)