package fr.perso.huile.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Plante {
	@Id
	@Column(name = "plante_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "plante_libelle", nullable = false)
	private String libelle;
	
	@Column(name = "plante_libelle_latin")
	private String libelle_latin;
	
	@OneToOne(mappedBy = "plante")
	private HuileEssentielle huile;
}
