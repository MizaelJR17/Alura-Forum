package br.com.alura.forum.controller

import br.alura.com.forum.model.Curso
import br.alura.com.forum.model.Topico
import br.alura.com.forum.model.Usuario
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
@RequestMapping( "/topicos")



class TopicoController {

        @GetMapping
        fun listar(): List<Topico>{
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


         return Arrays.asList(topico,topico,topico)

        }




}