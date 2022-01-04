package ufps.springBoot.juego.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ufps.springBoot.juego.models.entities.Categoria;

public interface ICategoriaDao  extends JpaRepository<Categoria, Long> {
}
