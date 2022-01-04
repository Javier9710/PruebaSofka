package ufps.springBoot.juego.models.service;

import org.springframework.beans.factory.annotation.Autowired;

import ufps.springBoot.juego.models.dao.IJugadorDao;
import ufps.springBoot.juego.models.dao.IRondaDao;
import ufps.springBoot.juego.models.entities.Jugador;
import ufps.springBoot.juego.models.entities.Ronda;

public class RondaSeriviceImpl implements IRondaService {
	
	@Autowired
	private IRondaDao rondaDao;
	
	@Autowired
	private IJugadorDao jugadorDao;
	
	

	@Override
	public Jugador guardarJugador(Jugador jugador) {
	
		return jugadorDao.save(jugador);
	}
	
	
	//--------------------------------------------------------
	

	@Override
	public Ronda guardarRonda(Ronda ronda) {
		return rondaDao.save(ronda);
	}

}
