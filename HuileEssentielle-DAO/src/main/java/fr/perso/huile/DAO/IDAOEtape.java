package fr.perso.huile.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.perso.huile.model.Etape;

public interface IDAOEtape extends JpaRepository<Etape, Integer> {
	

}
