package ufps.springBoot.juego.models.service;

import java.util.List;

import ufps.springBoot.juego.models.entities.Jugador;
import ufps.springBoot.juego.models.entities.Pregunta;
import ufps.springBoot.juego.models.entities.Premio;
import ufps.springBoot.juego.models.entities.Respuesta;
import ufps.springBoot.juego.models.entities.Ronda;

public interface IRondaService {
	
	public Jugador guardarJugador(Jugador jugador);
	
	public Jugador buscarJugadorNombre(String nombre);
	
	//---------------------------------------------------
	public Ronda setearRonda(Jugador jugador, List<Pregunta> pregunta, Premio premio);

	public Ronda guardarRonda(Ronda ronda);
	
	public Respuesta obtenerCorrecta(Ronda ronda);
	
	//--------------------------------------------------
	
	public Premio buscarPremioNievel(Long id);

	//----------------------------------------------------
	
    public void respuestaErronea(Ronda ronda);
    
    public void respuestaCorrecta(Ronda ronda);
}
