package br.com.alura.forum.controller

import br.com.alura.forum.dto.TopicoPorCategoriaDto
import br.com.alura.forum.service.TopicoService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@Controller
@RequestMapping("Relatorio")
class RelatorioController(
    private val topicoService: TopicoService
) {
    @GetMapping
    fun relatorio(model :Model): String {
        model.addAttribute("topicosPorCategoria",topicoService.relatorio())
        return "relatorio"
    }

}