package fr.perso.huile.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table
public class Utilisation {
	@Id
	@Column(name = "util_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "util_libelle", nullable = false)
	private String libelle;
	
	@ManyToMany(mappedBy = "utilisations")
	private List<HuileEssentielle> huiles;
	
}
