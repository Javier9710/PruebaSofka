package ufps.springBoot.juego.models.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "premios")
public class Premio {
	
	@Id
	@Column(name = "id_premio")
	private Long id;

	private double dinero;

}
