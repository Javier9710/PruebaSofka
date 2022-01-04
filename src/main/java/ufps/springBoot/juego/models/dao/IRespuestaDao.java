package ufps.springBoot.juego.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ufps.springBoot.juego.models.entities.Respuesta;

public interface IRespuestaDao extends JpaRepository<Respuesta, Long> {

}
