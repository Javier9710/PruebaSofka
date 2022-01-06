package ufps.springBoot.juego.models.service;

import ufps.springBoot.juego.models.entities.Categoria;
import ufps.springBoot.juego.models.entities.Pregunta;
import ufps.springBoot.juego.models.entities.Respuesta;

import java.util.List;

public interface IPreguntaService {

    public Pregunta guardar(Pregunta pregunta);

    public Pregunta getPregunta(Long id);

    public List<Pregunta> listaPreguntas();
    
    public List<Pregunta> listaPreguntasByCategoria(Long id);
    
    public boolean validaCantidadPreguntas();
    
   
    //----------------------------------------------

    public List<Categoria> listaCategorias();
    
    //----------------------------------------------
    
    public Respuesta guardarRespuesta(Respuesta respuesta);

}
