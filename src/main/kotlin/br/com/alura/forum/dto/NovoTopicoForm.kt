package br.com.alura.forum.dto

import javax.validation.constraints.NotEmpty
import javax.validation.constraints.NotNull
import javax.validation.constraints.Size

data class NovoTopicoForm(
        @field:NotEmpty( message = "Título deve conter  entre 5 a 100 Caracteres")
        @field:Size(min = 5, max = 100)
        val titulo: String,
        @field:NotEmpty (message = "Mensagem não pode ser vazia")
        val mensagem: String,
        @field:NotNull
        val idCurso: Long,
        @field:NotNull
        val idAutor: Long
)
