package br.com.alura.forum.model

import java.time.LocalDate
import java.time.LocalDateTime
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.ManyToMany

@Entity
data class Resposta(
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long? = null,
        val mensagem: String,
        val dataCriacao: LocalDateTime = LocalDateTime.now(),
        @ManyToMany
        val autor: Usuario,
        @ManyToMany
        val topico: Topico,
        val solucao: Boolean
)
