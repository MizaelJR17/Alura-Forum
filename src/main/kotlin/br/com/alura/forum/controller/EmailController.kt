package br.com.alura.forum.controller

import br.com.alura.forum.service.EmailService
import org.springframework.web.bind.annotation.*
import javax.validation.Valid

@RestController
@RequestMapping("/Email")
class EmailController (
    private val emailService : EmailService
){
    @PostMapping("/{emailAutor}")
    fun salvar(@PathVariable @Valid emailAutor :String) {
        emailService.notificar(emailAutor = emailAutor)
    }

}