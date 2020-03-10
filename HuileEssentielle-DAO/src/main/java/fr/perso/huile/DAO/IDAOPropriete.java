package fr.perso.huile.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.perso.huile.model.Propriete;

public interface IDAOPropriete extends JpaRepository<Propriete, Integer> {
	

}
