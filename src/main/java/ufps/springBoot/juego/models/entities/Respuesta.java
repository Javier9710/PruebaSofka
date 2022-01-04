package ufps.springBoot.juego.models.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "respuestas")
@Data
public class Respuesta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String respuesta;

    private Boolean correcta;

    @ManyToOne
    @JoinColumn(name = "id_pregunta")
    private Pregunta pregunta;
}
