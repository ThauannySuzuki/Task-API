package br.com.api.task.entity

import br.com.api.task.enums.StatusEnum
import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
@Table(name = "tasks")
data class TaskEntity (

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int? = null,

    @Column(name = "titulo")
    val titulo: String,

    @Column(name = "descricao")
    val descricao: String,

    @Column(name = "status")
    val status: StatusEnum,

    @Column(name = "criado_em")
    val criadoEm: LocalDateTime,

    @Column(name = "atualizado_em")
    val atualizadoEm: LocalDateTime? = LocalDateTime.now()

)