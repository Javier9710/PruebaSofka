package ufps.springBoot.juego.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
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
    public String guardarPregunta(Pregunta pregunta, @RequestParam(name = "respuestasForm[]") String[] respuestasForm, @RequestParam(name = "check") int check){
        preguntaService.guardar(pregunta);

        for (int i = 0; i < respuestasForm.length; i++) {
            Respuesta respuestaNew = new Respuesta();
            respuestaNew.setRespuesta(respuestasForm[i]);
            respuestaNew.setCorrecta(false);
            respuestaNew.setPregunta(pregunta);
            if (i==check) {
				respuestaNew.setCorrecta(true);
			}
            preguntaService.guardarRespuesta(respuestaNew);
        }

        return "redirect:form";
    }

    /*
    @GetMapping("/{id}")
    public ResponseEntity<Pregunta> obtenerPregunta(@PathVariable (name = "id", required = true) Long id){
        System.out.println("pruebaaaa-----" + id);
        Pregunta preguntaDB = preguntaService.getPregunta(id);
        System.out.println("pruebaaaa-----" + preguntaDB.getDescripcion());
        if (preguntaDB == null){
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(preguntaDB);

    }


    @GetMapping
    public ResponseEntity<List<Pregunta>> listarTodos(){
        List<Pregunta> preguntas = preguntaService.listaPreguntas();

        return ResponseEntity.ok(preguntas);
    }*/

}
