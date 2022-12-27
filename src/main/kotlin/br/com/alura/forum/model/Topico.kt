package br.com.alura.forum.model

import java.time.LocalDateTime
import javax.persistence.*

@Entity
//@Table(name = "Topico")
 data class Topico(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,
    var  titulo: String,
    var mensagem: String,
    val dataCriacao: LocalDateTime = LocalDateTime.now(),
    @ManyToMany
    val curso: Curso,
    @ManyToMany
    val autor: Usuario,
    @Enumerated(value = EnumType.STRING)
    val status: StatusTopico = StatusTopico.NAO_RESPONDIDO,
    @OneToMany(mappedBy = "topico")
    val respostas: List<Resposta> = ArrayList()
)
{


}