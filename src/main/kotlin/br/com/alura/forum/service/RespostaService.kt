package br.com.alura.forum.service

import br.com.alura.forum.model.Resposta
import org.springframework.stereotype.Service

@Service
class RespostaService(
    private val emailService: EmailService
) {

    fun salvar(resposta: Resposta){
        val emailAutor = resposta.topico.autor.email
        emailService.notificar(emailAutor)
    }


}