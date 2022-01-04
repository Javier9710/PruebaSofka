package ufps.springBoot.juego.models.service;

import ufps.springBoot.juego.models.entities.Jugador;
import ufps.springBoot.juego.models.entities.Ronda;

public interface IRondaService {
	
	public Jugador guardarJugador(Jugador jugador);
	
	
	//---------------------------------------------------
	
	
	
	public Ronda guardarRonda(Ronda ronda);

}
