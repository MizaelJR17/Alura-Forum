package br.com.alura.forum.service

import br.alura.com.forum.model.Curso
import br.alura.com.forum.model.Topico
import br.alura.com.forum.model.Usuario
import org.springframework.stereotype.Service
import java.util.*


@Service
class TopicoService (private var topicos : List<Topico>) {


    init {
        val  topico = Topico (
            id= 1,
            titulo = "Duvida Kotlin" ,
            mensagem = "Variaveis no Kotlin",
            curso = Curso(
                id = 1 ,
                nome= "Kotlin",
                categoria = "Programacao"

            ) ,
            autor =  Usuario(

                id= 1 ,
                nome= " Mizael julio" ,
                email = "Mizael@gamil.com"

            )
        )


        val  topico2 = Topico (
            id= 2,
            titulo = "Duvida Kotlin" ,
            mensagem = "Variaveis no Kotlin",
            curso = Curso(
                id = 2 ,
                nome= "Kotlin",
                categoria = "Programacao"

            ) ,
            autor =  Usuario(

                id= 2 ,
                nome= " Mizael julio" ,
                email = "Mizael@gamil.com"

            )
        )



        val  topico3 = Topico (
            id= 3 ,
            titulo = "Duvida Kotlin" ,
            mensagem = "Variaveis no Kotlin",
            curso = Curso(
                id = 3 ,
                nome= "Kotlin",
                categoria = "Programacao"

            ) ,
            autor =  Usuario(

                id= 3 ,
                nome= " Mizael julio" ,
                email = "Mizael@gamil.com"

            )
        )






        topicos = Arrays.asList(topico,topico2,topico3)

    }

        fun listar(): List<Topico> {
            return topicos
        }



        fun buscarPorId(id: Long) : Topico {
            return  topicos.stream().filter({
                t -> t.id == id
            }).findFirst().get()
        }

    }