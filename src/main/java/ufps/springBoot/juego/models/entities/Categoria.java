package ufps.springBoot.juego.models.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "categorias")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_categoria")
    private Long id;
    private String nombre;

}
