package ufps.springBoot.juego.models.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ufps.springBoot.juego.models.dao.IJugadorDao;
import ufps.springBoot.juego.models.dao.IPremioDao;
import ufps.springBoot.juego.models.dao.IRondaDao;
import ufps.springBoot.juego.models.entities.Jugador;
import ufps.springBoot.juego.models.entities.Pregunta;
import ufps.springBoot.juego.models.entities.Premio;
import ufps.springBoot.juego.models.entities.Respuesta;
import ufps.springBoot.juego.models.entities.Ronda;

@Service
public class RondaSeriviceImpl implements IRondaService {

	@Autowired
	private IRondaDao rondaDao;

	@Autowired
	private IJugadorDao jugadorDao;
	
	
	@Autowired
	private IPremioDao premioDao;
	
	

	@Override
	public Jugador guardarJugador(Jugador jugador) {

		return jugadorDao.save(jugador);
	}

	@Override
	public Jugador buscarJugadorNombre(String nombre) {
		return jugadorDao.findByNombre(nombre);
	}
	
	@Override
	public List<Jugador> listaJugadores() {
		return jugadorDao.findAll();
	}

	
	// --------------------------------------------------------

	@Override
	public Ronda setearRonda(Jugador jugador, List<Pregunta> preguntas, Premio premio) {
		int numero = (int) (Math.random()*((preguntas.size()-1)-0+1)+0);
		Ronda rondaNew = new Ronda();
		rondaNew.setJugador(jugador);
		rondaNew.setPregunta(preguntas.get(numero));
		rondaNew.setPremio(premio);
		rondaNew.setEstado("sin contestar");
		return rondaNew;
	}
	
	@Override
	public Ronda guardarRonda(Ronda ronda) {
		return rondaDao.save(ronda);
	}

	
	@Override
	public List<Ronda> listaMejorRondaJugador() {
		List<Jugador> jugadores = this.listaJugadores();
		List<Ronda> mejorRonda = new ArrayList<>();
		for (int i = 0; i < jugadores.size(); i++) {
			mejorRonda.add(jugadores.get(i).getRondas().get(jugadores.get(i).getRondas().size()-1));
			System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxx: " + mejorRonda.get(i).getJugador().getAcumulado());
		}
		return mejorRonda;
	}
	
	@Override
	public Ronda buscarRonda(Long id) {
		return rondaDao.findById(id).orElse(null);
	}
	
	//-------------------------------------------------------

	@Override
	public Premio buscarPremioNievel(Long id) {
		return premioDao.findById(id).orElse(null);
	}
	
	//-----------------------------------------------------


	public Respuesta obtenerCorrecta(Ronda ronda) {
		List<Respuesta> respuestas = ronda.getPregunta().getRespuestas();
		Respuesta correcta = null;
		for (int i = 0; i < respuestas.size(); i++) {
			if (respuestas.get(i).getCorrecta() == true) {
				correcta = respuestas.get(i);
			}
		}
		return correcta;
	}
	
	@Override
	public void respuestaErronea(Ronda ronda) {
		ronda.getJugador().setAcumulado(0);;
		ronda.setEstado("PERDEDOR");
		this.guardarRonda(ronda);
	}

	@Override
	public void respuestaCorrecta(Ronda ronda) {
		ronda.setEstado("GANADOR");
		ronda.getJugador().setAcumulado(ronda.getJugador().getAcumulado() + ronda.getPremio().getDinero());
		this.guardarRonda(ronda);	
	}







}
