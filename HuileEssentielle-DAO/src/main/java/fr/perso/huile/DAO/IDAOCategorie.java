package fr.perso.huile.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.perso.huile.model.Categorie;

public interface IDAOCategorie extends JpaRepository<Categorie, Integer> {
	

}
