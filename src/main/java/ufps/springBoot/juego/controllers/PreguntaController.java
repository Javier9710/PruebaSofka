package ufps.springBoot.juego.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import ufps.springBoot.juego.models.dao.ICategoriaDao;
import ufps.springBoot.juego.models.dao.IRespuestaDao;
import ufps.springBoot.juego.models.entities.Categoria;
import ufps.springBoot.juego.models.entities.Pregunta;
import ufps.springBoot.juego.models.entities.Respuesta;
import ufps.springBoot.juego.models.service.IPreguntaService;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/pregunta")
public class PreguntaController {

    @Autowired
    private IPreguntaService preguntaService;

    @GetMapping("/form")
    public String crearPregunta(Model model){
        List<Categoria> categorias = preguntaService.listaCategorias();
        model.addAttribute("categorias", categorias);
        model.addAttribute("preguntaObj", new Pregunta());
        return "preguntas/form";
    }


    @PostMapping("/guardar")
    public String guardarPregunta(Pregunta pregunta, @RequestParam(name = "respuestasForm[]") String[] respuestasForm, 
    		@RequestParam(name = "check") int check, RedirectAttributes flash){
        	preguntaService.guardar(pregunta);
        	preguntaService.setearPregunta(pregunta, check, respuestasForm);

       flash.addFlashAttribute("success", "Pregunta registrada con exito");

        return "redirect:form";
    }


}
