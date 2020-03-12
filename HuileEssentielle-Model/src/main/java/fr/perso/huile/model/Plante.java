package fr.perso.huile.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonView;

import fr.perso.huile.views.Views;

@Entity
@Table
public class Plante {
	@Id
	@Column(name = "plante_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonView(Views.Common.class)
	private int id;

	@Column(name = "plante_libelle", nullable = false)
	@JsonView({ Views.HuileEssentielle.class, Views.Plante.class })
	private String libelle;

	@Column(name = "plante_libelle_latin")
	@JsonView(Views.Plante.class)
	private String libelle_latin;

	@OneToOne(mappedBy = "plante")
	@JsonView(Views.Plante.class)
	private HuileEssentielle huile;

	@Column(name = "plante_location")
	@JsonView(Views.Common.class)
	private String location;

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

	public String getLibelle_latin() {
		return libelle_latin;
	}

	public void setLibelle_latin(String libelle_latin) {
		this.libelle_latin = libelle_latin;
	}

	public HuileEssentielle getHuile() {
		return huile;
	}

	public void setHuile(HuileEssentielle huile) {
		this.huile = huile;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	
}
