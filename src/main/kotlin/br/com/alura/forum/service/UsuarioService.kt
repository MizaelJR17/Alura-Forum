package br.com.alura.forum.service

import br.alura.com.forum.model.Usuario
import org.springframework.stereotype.Service

@Service
data class UsuarioService ( var usuarios: List<Usuario>

        ){
init {
     val usuario = Usuario (
             id = 1,
             nome = "Ana da Silva" ,
             email = "ana@email.com.br"
             )


}
 fun buscarPorId (id: Long ): Usuario {
         return  usuarios.stream().filter({
                         c-> c.id == id
         }).findFirst().get()

 }

}
