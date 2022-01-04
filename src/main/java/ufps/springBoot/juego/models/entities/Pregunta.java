package ufps.springBoot.juego.models.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import lombok.ToString;
import org.w3c.dom.stylesheets.LinkStyle;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name = "preguntas")
public class Pregunta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pregunta")
    private Long id;

    private String descripcion;


    @OneToMany(mappedBy = "pregunta", fetch = FetchType.LAZY)
    @JsonManagedReference
    @ToString.Exclude
    private List<Respuesta> respuestas;

    @ManyToOne
    @JoinColumn(name = "id_categoria")
    private Categoria categoria;

 
}
