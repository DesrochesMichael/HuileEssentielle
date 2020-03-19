package fr.perso.huile.model;

import java.sql.Blob;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
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

	@Column(name = "plante_libelleLatin")
	@JsonView(Views.Plante.class)
	private String libelleLatin;

	@OneToOne(mappedBy = "plante")
	@JsonView(Views.Plante.class)
	private HuileEssentielle huile;

	@Column(name = "plante_location")
	@JsonView(Views.Common.class)
	private String provenance;

	@Column(name = "plante_detail")
	@JsonView(Views.Common.class)
	private String detail;

	@Column(name = "image")
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

	public String getLibelleLatin() {
		return libelleLatin;
	}

	public void setLibelleLatin(String libelleLatin) {
		this.libelleLatin = libelleLatin;
	}

	public HuileEssentielle getHuile() {
		return huile;
	}

	public void setHuile(HuileEssentielle huile) {
		this.huile = huile;
	}

	public String getProvenance() {
		return provenance;
	}

	public void setProvenance(String provenance) {
		this.provenance = provenance;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

}
