package ufps.springBoot.juego.models.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ufps.springBoot.juego.models.dao.ICategoriaDao;
import ufps.springBoot.juego.models.dao.IPreguntaDao;
import ufps.springBoot.juego.models.dao.IRespuestaDao;
import ufps.springBoot.juego.models.entities.Categoria;
import ufps.springBoot.juego.models.entities.Pregunta;
import ufps.springBoot.juego.models.entities.Respuesta;

import java.util.List;

@Service
public class PreguntaServiceImpl implements IPreguntaService{

    @Autowired
    private IPreguntaDao preguntaDao;


    @Autowired
    private ICategoriaDao categoriaDao;
    
    @Autowired
    private IRespuestaDao respuestaDao;
    
    
    

    @Override
    public Pregunta guardar(Pregunta pregunta) {
        return preguntaDao.save(pregunta);
    }

    @Override
    public Pregunta getPregunta(Long id) {
        return preguntaDao.findById(id).orElse(null);
    }

    @Override
    public List<Pregunta> listaPreguntas() {
        return preguntaDao.findAll();
    }
    
	@Override
	public List<Pregunta> listaPreguntasByCategoria(Long id) {
		return preguntaDao.buscarPorcategoria(id);
	}
    

    //-----------------------------------------------------

    @Override
    public List<Categoria> listaCategorias() {
        return categoriaDao.findAll();
    }

    //--------------------------------------------------------
    
	@Override
	public Respuesta guardarRespuesta(Respuesta respuesta) {
		return respuestaDao.save(respuesta);
	}



}
