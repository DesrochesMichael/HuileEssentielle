package fr.perso.huile.model;

import java.util.ArrayList;
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

import com.fasterxml.jackson.annotation.JsonView;

import fr.perso.huile.views.Views;

@Entity
@Table
public class HuileEssentielle {

	@Id
	@Column(name = "he_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonView(Views.Common.class)
	private int id;

	@Column(name = "he_libelle", nullable = false)
	@JsonView(Views.HuileEssentielle.class)
	private String libelle;

	@OneToOne(cascade = { CascadeType.ALL })
	@JoinColumn(name = "he_plante", referencedColumnName = "plante_id")
	@JsonView(Views.HuileEssentielle.class)
	private Plante plante;

	@OneToMany(mappedBy = "huile", cascade = { CascadeType.ALL })
	@Column(name = "he_etapes")
	@JsonView(Views.HuileEssentielle.class)
	private List<Etape> etapes;

	@ManyToMany(cascade = { CascadeType.ALL })
	@JoinTable(name = "he_cat", joinColumns = @JoinColumn(name = "he_id"), inverseJoinColumns = @JoinColumn(name = "cat_id"))
	@JsonView(Views.HuileEssentielle.class)
	private List<Categorie> categories;

	@ManyToMany(cascade = { CascadeType.ALL })
	@JoinTable(name = "he_proprietes", joinColumns = @JoinColumn(name = "he_id"), inverseJoinColumns = @JoinColumn(name = "prop_id"))
	@JsonView(Views.HuileEssentielle.class)
	private List<Propriete> proprietes;

	@ManyToMany(cascade = { CascadeType.ALL })
	@JoinTable(name = "he_util", joinColumns = @JoinColumn(name = "he_id"), inverseJoinColumns = @JoinColumn(name = "util_id"))
	@JsonView(Views.HuileEssentielle.class)
	private List<Utilisation> utilisations = new ArrayList<Utilisation>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public Plante getPlante() {
		return plante;
	}

	public void setPlante(Plante plante) {
		this.plante = plante;
	}

	public List<Etape> getEtapes() {
		if (etapes == null) {
			etapes = new ArrayList<Etape>();
		}
		return etapes;
	}

	public void setEtapes(List<Etape> etapes) {
		if (etapes == null) {
			etapes = new ArrayList<Etape>();
		}
		this.etapes = etapes;
	}

	public List<Categorie> getCategories() {
		if (categories == null) {
			categories = new ArrayList<Categorie>();
		}
		return categories;
	}

	public void setCategories(List<Categorie> categories) {
		if (categories == null) {
			categories = new ArrayList<Categorie>();
		}
		this.categories = categories;
	}

	public List<Propriete> getProprietes() {
		if (proprietes == null) {
			proprietes = new ArrayList<Propriete>();
		}
		return proprietes;
	}

	public void setProprietes(List<Propriete> proprietes) {
		if (proprietes == null) {
			proprietes = new ArrayList<Propriete>();
		}
		this.proprietes = proprietes;
	}

	public List<Utilisation> getUtilisations() {
		if (utilisations == null) {
			utilisations = new ArrayList<Utilisation>();
		}
		return utilisations;
	}

	public void setUtilisations(List<Utilisation> utilisations) {
		if (utilisations == null) {
			utilisations = new ArrayList<Utilisation>();
		}
		this.utilisations = utilisations;
	}

}
