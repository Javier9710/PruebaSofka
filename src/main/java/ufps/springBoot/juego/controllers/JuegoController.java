package ufps.springBoot.juego.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ufps.springBoot.juego.models.entities.Jugador;

@Controller
@RequestMapping("/juego")
public class JuegoController {
	
	
	@GetMapping("/iniciar")
	public String iniciar(Model model) {
		model.addAttribute("jugadorObj", new Jugador());
		
		return "juego/form";
		
	}

}
