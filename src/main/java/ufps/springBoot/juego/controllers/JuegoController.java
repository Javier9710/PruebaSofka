package ufps.springBoot.juego.controllers;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ufps.springBoot.juego.models.entities.Jugador;
import ufps.springBoot.juego.models.entities.Pregunta;
import ufps.springBoot.juego.models.entities.Premio;
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
	
	@PostMapping("/crearRonda")
	public String crearRonda(Jugador jugador, Model model) {
		rondaService.guardarJugador(jugador);
		List<Pregunta> preguntas = preguntaService.listaPreguntasByCategoria(nivel);
		int numero = (int) (Math.random()*((preguntas.size()-1)-0+1)+0);	
		Premio premio = new Premio();
		premio.setId(nivel);
		//crear ronda
		Ronda rondaNew = new Ronda();
		rondaNew.setJugador(jugador);
		rondaNew.setPregunta(preguntas.get(numero));
		rondaNew.setPremio(premio);
		rondaNew.setEstado("sin contestar");
		
		rondaService.guardarRonda(rondaNew);
		
		model.addAttribute("ronda", rondaNew);
		
		
		return "juego/ronda";
	}
	
	
	@PostMapping("/verificar")
	public String verificar(Ronda ronda, @RequestParam() Long id) {
		
		
		
		
		return "redirect:/crearRonda";
		
	}
	
	
	

}
