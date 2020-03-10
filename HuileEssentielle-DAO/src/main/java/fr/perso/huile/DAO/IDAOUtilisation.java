package fr.perso.huile.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.perso.huile.model.Etape;
import fr.perso.huile.model.Utilisation;

public interface IDAOUtilisation extends JpaRepository<Utilisation, Integer> {
	

}
