package ufps.springBoot.juego.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ufps.springBoot.juego.models.entities.Premio;

public interface IPremioDao extends JpaRepository<Premio, Long> {

}
