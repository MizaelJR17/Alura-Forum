package br.com.alura.forum.service

import org.springframework.mail.MailMessage
import org.springframework.mail.SimpleMailMessage
import org.springframework.mail.javamail.JavaMailSender
import org.springframework.stereotype.Service

@Service
class EmailService(
     private val javaMailSender : JavaMailSender
) {

   fun notificar(emailAutor:String){
        val message = SimpleMailMessage()
        message.setFrom("zcgamerbr@gmail.com")
        message.setSubject("{Luciana Dev} Você passou !!!")
        message.setText("Quer casar comigo ????")
        message.setTo(emailAutor)

       javaMailSender.send(message)
    }
}