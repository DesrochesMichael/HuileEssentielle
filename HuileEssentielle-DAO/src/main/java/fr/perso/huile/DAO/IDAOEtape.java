package fr.perso.huile.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.perso.huile.model.Etape;

public interface IDAOEtape extends JpaRepository<Etape, Integer> {
	
	public List<Etape> findByHuileIdOrderByOrdreAsc(int id);
	

}
