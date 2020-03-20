package fr.perso.huile.model;

import javax.persistence.CascadeType;
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
	@JsonView({ Views.Etape.class, Views.HuileEssentielle.class })
	private String libelle;

	@ManyToOne(cascade = { CascadeType.ALL })
	@JoinColumn(name = "he_etapes")
	@JsonView(Views.Etape.class)
	private HuileEssentielle huile;

	@Column(name = "et_ordre", nullable = false)
	@JsonView(Views.Etape.class)
	private int ordre;

	@Column(name = "et_image", nullable = false)
	@JsonView(Views.Etape.class)
	private String image;

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

	public int getOrdre() {
		return ordre;
	}

	public void setOrdre(int ordre) {
		this.ordre = ordre;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

}
