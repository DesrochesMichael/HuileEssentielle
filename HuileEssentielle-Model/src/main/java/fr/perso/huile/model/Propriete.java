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
public class Propriete {

	@Id
	@Column(name = "prop_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "prop_libelle", nullable = false)
	private String libelle;
	
	@ManyToMany(mappedBy = "proprietes")
	private List<HuileEssentielle> huiles;
}
