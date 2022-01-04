package ufps.springBoot.juego.models.service;

import org.springframework.beans.factory.annotation.Autowired;
import ufps.springBoot.juego.models.dao.IPreguntaDao;
import ufps.springBoot.juego.models.entities.Pregunta;

public class PreguntaServiceImpl implements IPreguntaService{

    @Autowired
    private IPreguntaDao preguntaDao;

    @Override
    public Pregunta guardar(Pregunta pregunta) {
        return preguntaDao.save(pregunta);
    }
}
