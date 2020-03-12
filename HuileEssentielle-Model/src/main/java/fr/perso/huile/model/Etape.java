package fr.perso.huile.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonView;

import fr.perso.huile.views.Views;

@Entity
@Table
public class Etape {
	@Id
	@Column(name = "et_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonView(Views.Common.class)
	private int id;

	@Column(name = "et_libelle", nullable = false)
	@JsonView({Views.Etape.class,Views.HuileEssentielle.class })
	private String libelle;
	
	@ManyToOne
	@JoinColumn(name = "he_etapes")
	@JsonView(Views.Etape.class)
	private HuileEssentielle huile;

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

	public HuileEssentielle getHuile() {
		return huile;
	}

	public void setHuile(HuileEssentielle huile) {
		this.huile = huile;
	}

	
}
