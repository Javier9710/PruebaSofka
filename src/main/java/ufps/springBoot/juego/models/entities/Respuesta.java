package ufps.springBoot.juego.models.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "respuestas")
@Data
public class Respuesta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_respuesta")
    private Long id;

    private String respuesta;

    private Boolean correcta;

    @ManyToOne
    @JoinColumn(name = "id_pregunta" )
    @JsonBackReference
    private Pregunta pregunta;
    
    
    /*
    @PrePersist
    public void prePersist() {
    	this.correcta=false;
    }*/

}
