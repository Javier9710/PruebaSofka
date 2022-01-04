package ufps.springBoot.juego.models.service;

import org.springframework.stereotype.Service;
import ufps.springBoot.juego.models.entities.Pregunta;

public interface IPreguntaService {

    public Pregunta guardar(Pregunta pregunta);
}
