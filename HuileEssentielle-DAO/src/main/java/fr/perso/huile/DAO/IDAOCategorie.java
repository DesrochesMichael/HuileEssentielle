package fr.perso.huile.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.perso.huile.model.Catégorie;

public interface IDAOCategorie extends JpaRepository<Catégorie, Integer> {
	

}
