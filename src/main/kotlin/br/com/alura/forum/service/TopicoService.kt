package br.com.alura.forum.service

import br.alura.com.forum.model.Curso
import br.alura.com.forum.model.Topico
import br.alura.com.forum.model.Usuario
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.RequestBody
import java.util.*
import kotlin.collections.ArrayList


@Service
class TopicoService (private var topicos : List<Topico> = ArrayList() ) {




        fun listar(): List<Topico> {
            return topicos
        }



        fun buscarPorId(id: Long) : Topico {
            return  topicos.stream().filter({
                t -> t.id == id
            }).findFirst().get()
        }

    fun cadastrar(@RequestBody topico: Topico) {

        topicos.plus(topico)
    }


}