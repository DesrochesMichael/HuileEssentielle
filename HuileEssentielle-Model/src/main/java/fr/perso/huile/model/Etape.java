package fr.perso.huile.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Etape {
	@Id
	@Column(name = "et_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "et_libelle", nullable = false)
	private String libelle;
	
	@ManyToOne
	@JoinColumn(name = "he_etapes")
	private HuileEssentielle huile;
	
}
