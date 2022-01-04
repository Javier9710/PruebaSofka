package ufps.springBoot.juego.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ufps.springBoot.juego.models.entities.Ronda;

public interface IRondaDao extends JpaRepository<Ronda, Long> {

}
