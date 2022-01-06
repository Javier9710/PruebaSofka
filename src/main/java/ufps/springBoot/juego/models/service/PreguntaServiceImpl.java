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
	
	@Override
	public boolean validaCantidadPreguntas() {
		int cont1=0;
		int cont2=0;
		int cont3=0;
		int cont4=0;
		int cont5=0;
		List<Pregunta> preguntas = this.listaPreguntas();
		if(preguntas.size()<10) {
			return false;
			
		}else {
			for (int i = 0; i < preguntas.size(); i++) {
				if(preguntas.get(i).getCategoria().getId()==1) {
					cont1++;
				}
				if(preguntas.get(i).getCategoria().getId()==2) {
					cont2++;
				}
				if(preguntas.get(i).getCategoria().getId()==3) {
					cont3++;
				}
				if(preguntas.get(i).getCategoria().getId()==4) {
					cont4++;
				}
				if(preguntas.get(i).getCategoria().getId()==5) {
					cont5++;
				}
			}	
		}
		if (cont1<2 || cont2<2 || cont3<2 || cont4<2 || cont5<2) {
			return false;
		}
		
		return true;
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
