package ufps.springBoot.juego.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import ufps.springBoot.juego.models.entities.Jugador;
import ufps.springBoot.juego.models.entities.Pregunta;
import ufps.springBoot.juego.models.entities.Premio;
import ufps.springBoot.juego.models.entities.Respuesta;
import ufps.springBoot.juego.models.entities.Ronda;
import ufps.springBoot.juego.models.service.IPreguntaService;
import ufps.springBoot.juego.models.service.IRondaService;

@Controller
@RequestMapping("/juego")
public class JuegoController {
	
	@Autowired
	private IRondaService rondaService;
	
	@Autowired
	private IPreguntaService preguntaService;
	
	
	private Long nivel=1L;
	
	
	@GetMapping("/iniciar")
	public String iniciar(Model model) {
		model.addAttribute("jugadorObj", new Jugador());
		
		return "juego/form";
		
	}
	
	@GetMapping("/regJugador")
	public String registrarJugador(Jugador jugador, RedirectAttributes flash) {
		
		boolean validacion = preguntaService.validaCantidadPreguntas();
		
	if (validacion==false) {
		flash.addFlashAttribute("warning", "No existen las cantidad minima de preguntas para iniciar");
		return "redirect:/juego/iniciar";
	}
		Jugador jugadorAux = rondaService.buscarJugadorNombre(jugador.getNombre());
		if(jugadorAux==null) {
		rondaService.guardarJugador(jugador);
		flash.addAttribute("jugador", jugador);
		return "redirect:/juego/crearRonda";
		}else {
			flash.addFlashAttribute("error", "El nombre ya ha sido usado, por favor pruebe uno distinto");
			return "redirect:/juego/iniciar";
		}
	}
	
	@GetMapping("/crearRonda")
	public String crearRonda(Jugador jugador, Model model, RedirectAttributes flash) {
		
		List<Pregunta> preguntas = preguntaService.listaPreguntasByCategoria(nivel);
		Premio premio = rondaService.buscarPremioNievel(nivel);
		Ronda rondaNew = rondaService.setearRonda(jugador, preguntas, premio);
		rondaService.guardarRonda(rondaNew);
		model.addAttribute("ronda", rondaNew);
		return "juego/ronda";
	}
	
	
	@GetMapping("/verificar")
	public String verificar(Ronda ronda, @RequestParam(name = "check") Long id, RedirectAttributes flash) {
		
		Respuesta correcta = rondaService.obtenerCorrecta(ronda);
		
		if (correcta.getId() == id) {
			rondaService.respuestaCorrecta(ronda);
			if(nivel!=5) {
			nivel++;
			flash.addAttribute("jugador", ronda.getJugador());
			flash.addFlashAttribute("success", "Su respuesta fue Correcta");
			return "redirect:/juego/crearRonda";
			}else {
				flash.addFlashAttribute("success", "Feliciades, Acabas de ganar el juego");
				nivel=1L;
				return "redirect:/juego/iniciar"; 
			}
		}else {
			rondaService.respuestaErronea(ronda);
			nivel=1L;
			flash.addFlashAttribute("error", "No has acertado la respuesta");
			return "redirect:/juego/iniciar";
		}
		
}
	
	@GetMapping("/retirar/{id}")
	public String retiroPartida(@PathVariable(name = "id") Long id, RedirectAttributes flash) {
		Ronda ronda = rondaService.buscarRonda(id);
		nivel=1L;
		ronda.setEstado("RETIRADO");
		rondaService.guardarRonda(ronda);
		flash.addFlashAttribute("info", "Te Has retirado de la partida");
		return "redirect:/juego/iniciar";
	}
}
