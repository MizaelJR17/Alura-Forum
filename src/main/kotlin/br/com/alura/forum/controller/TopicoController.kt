package br.com.alura.forum.controller

import br.alura.com.forum.model.Curso
import br.alura.com.forum.model.Topico
import br.alura.com.forum.model.Usuario
import br.com.alura.forum.service.TopicoService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
@RequestMapping( "/topicos")



class TopicoController(private val service: TopicoService) {

    @GetMapping
    fun listar(): List<Topico> {

        return service.listar()

    }

    @GetMapping("/{id}")
    fun buscarPorId(@PathVariable id: Long ) : Topico {

        return service.buscarPorId(id)

    }

    @PostMapping
    fun cadastrar (topico: Topico ) {

        return service.cadastrar(topico)

    }



}