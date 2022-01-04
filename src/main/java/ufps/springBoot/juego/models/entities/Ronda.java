package ufps.springBoot.juego.models.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "rondas")
@Data
public class Ronda {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_ronda")
	private Long id;
	
	
	@ManyToOne
	@JoinColumn(name = "id_jugador")
	private Jugador jugador;
	
	@ManyToOne
	@JoinColumn(name = "id_premio")
	private Premio premio;
	
	@ManyToOne
	@JoinColumn(name = "id_pregunta")
	private Pregunta pregunta;
	
	private String estado;
	

}
