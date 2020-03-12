package fr.perso.huile.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonView;

import fr.perso.huile.views.Views;

@Entity
@Table
public class Propriete {

	@Id
	@Column(name = "prop_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonView(Views.Common.class)
	private int id;
	
	@Column(name = "prop_libelle", nullable = false)
	@JsonView({Views.Propriete.class, Views.HuileEssentielle.class})
	private String libelle;
	
	@ManyToMany(mappedBy = "proprietes")
	@JsonView(Views.Propriete.class)
	private List<HuileEssentielle> huiles;

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

	public List<HuileEssentielle> getHuiles() {
		return huiles;
	}

	public void setHuiles(List<HuileEssentielle> huiles) {
		this.huiles = huiles;
	}
	
	
}
