package ufps.springBoot.juego.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ufps.springBoot.juego.models.entities.Pregunta;

public interface IPreguntaDao extends JpaRepository<Pregunta, Long> {
}
