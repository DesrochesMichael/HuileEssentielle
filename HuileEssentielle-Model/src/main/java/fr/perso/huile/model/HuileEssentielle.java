package fr.perso.huile.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table
public class HuileEssentielle {

	@Id
	@Column(name = "he_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "he_libelle", nullable = false)
	private String libelle;
	
	@Column(name = "he_plante")
	private Plante plante;
	
	@Column(name = "he_preparation")
	private Preparation preaparation;
	
	@ManyToMany(cascade = {
	        CascadeType.PERSIST,
	        CascadeType.MERGE})
	@JoinTable(name = "he_proprietes",
	        joinColumns = @JoinColumn(name = "he_id"),
	        inverseJoinColumns = @JoinColumn(name = "prop_id"))
	private List<Propriete> proprietes;
	
	@ManyToMany(cascade = {
	        CascadeType.PERSIST,
	        CascadeType.MERGE})
	@JoinTable(name = "he_proprietes",
	        joinColumns = @JoinColumn(name = "he_id"),
	        inverseJoinColumns = @JoinColumn(name = "util_id"))
	private List<Utilisation> utlisations;
	
	
	
}
