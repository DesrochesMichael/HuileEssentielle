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
public class Catégorie {
	@Id
	@Column(name = "cat_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "cat_libelle", nullable = false)
	private String libelle;
	
	@ManyToMany(mappedBy = "categories")
	private List<HuileEssentielle> huiles;
	
}
