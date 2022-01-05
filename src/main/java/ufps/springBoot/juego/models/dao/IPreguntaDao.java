package ufps.springBoot.juego.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import ufps.springBoot.juego.models.entities.Pregunta;

public interface IPreguntaDao extends JpaRepository<Pregunta, Long> {
	
	@Query("SELECT p FROM Pregunta p WHERE p.categoria.id=?1")
	public List<Pregunta> buscarPorcategoria(Long id);
}
