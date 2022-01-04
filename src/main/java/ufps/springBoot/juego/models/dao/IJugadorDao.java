package ufps.springBoot.juego.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ufps.springBoot.juego.models.entities.Jugador;

public interface IJugadorDao extends JpaRepository<Jugador, Long> {

}
