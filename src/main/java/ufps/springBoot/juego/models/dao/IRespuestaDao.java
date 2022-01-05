package ufps.springBoot.juego.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import ufps.springBoot.juego.models.entities.Respuesta;

public interface IRespuestaDao extends JpaRepository<Respuesta, Long> {
	
}
