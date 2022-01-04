package ufps.springBoot.juego.models.entities;

import lombok.Data;
import org.w3c.dom.stylesheets.LinkStyle;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "preguntas")
public class Pregunta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pregunta")
    private Long id;

    private String pregunta;


    @OneToMany(mappedBy = "pregunta")
    private List<Respuesta> respuestas;

    @ManyToOne
    @JoinColumn(name = "id_categoria")
    private Categoria categoria;
}
