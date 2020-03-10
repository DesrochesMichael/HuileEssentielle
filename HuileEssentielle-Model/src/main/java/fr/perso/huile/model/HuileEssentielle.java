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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
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
	
	@OneToOne
	@JoinColumn(name = "he_plante", referencedColumnName = "plante_id")
	private Plante plante;
	
	@OneToMany(mappedBy="huile")
	@Column(name = "he_etapes")
	private List<Etape> etapes;
	
	@ManyToMany(cascade = {
	        CascadeType.PERSIST,
	        CascadeType.MERGE})
	@JoinTable(name = "he_cat",
	        joinColumns = @JoinColumn(name = "he_id"),
	        inverseJoinColumns = @JoinColumn(name = "cat_id"))
	private List<Catégorie> categories;
	
	
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
	@JoinTable(name = "he_util",
	        joinColumns = @JoinColumn(name = "he_id"),
	        inverseJoinColumns = @JoinColumn(name = "util_id"))
	private List<Utilisation> utilisations;
	
	
	
}
