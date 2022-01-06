package ufps.springBoot.juego.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ufps.springBoot.juego.models.entities.Jugador;
import ufps.springBoot.juego.models.entities.Ronda;
import ufps.springBoot.juego.models.service.IRondaService;

@Controller
@RequestMapping("/historia")
public class HistoriaController {
	
	@Autowired
	private IRondaService rondaService;
	
	
	@GetMapping("/datos")
	public String mostrarDatos(Model model) {
		List<Ronda> datosJugadores = rondaService.listaMejorRondaJugador();
		model.addAttribute("datos", datosJugadores);	
		return "historial/historial";
	}

}
