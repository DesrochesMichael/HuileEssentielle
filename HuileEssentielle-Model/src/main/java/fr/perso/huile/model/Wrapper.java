package fr.perso.huile.model;

import java.util.ArrayList;
import java.util.List;

public class Wrapper {

	private List<Propriete> proprietes;

	private List<Categorie> categories;

	private List<Utilisation> utilisations;

	private List<Etape> etapes;
	
	private Plante plante;

	public void addPropriete(Propriete prop) {
		if (proprietes == null) {
			proprietes = new ArrayList<Propriete>();
		}
		this.proprietes.add(prop);
	}

	public void addCategorie(Categorie cat) {
		if (categories == null) {
			categories = new ArrayList<Categorie>();
		}
		this.categories.add(cat);
	}

	public void addUtilisation(Utilisation util) {
		if (utilisations == null) {
			utilisations = new ArrayList<Utilisation>();
		}
		this.utilisations.add(util);
	}

	public void addEtape(Etape etape) {
		if (etapes == null) {
			etapes = new ArrayList<Etape>();
		}
		this.etapes.add(etape);
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

	public List<Categorie> getCategories() {
		return categories;
	}

	public void setCategories(List<Categorie> categories) {
		this.categories = categories;
	}

	public List<Utilisation> getUtilisations() {
		return utilisations;
	}

	public void setUtilisations(List<Utilisation> utilisations) {
		this.utilisations = utilisations;
	}

	public List<Etape> getEtapes() {
		return etapes;
	}

	public void setEtapes(List<Etape> etapes) {
		this.etapes = etapes;
	}

	public Plante getPlante() {
		return plante;
	}

	public void setPlante(Plante plante) {
		this.plante = plante;
	}

}
