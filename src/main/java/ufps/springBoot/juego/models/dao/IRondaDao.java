package ufps.springBoot.juego.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import ufps.springBoot.juego.models.entities.Ronda;

public interface IRondaDao extends JpaRepository<Ronda, Long> {
	
	//@Query("SELECT r FROM Ronda r WHERE r.")
	//public List<Ronda> listHistorial();

}
