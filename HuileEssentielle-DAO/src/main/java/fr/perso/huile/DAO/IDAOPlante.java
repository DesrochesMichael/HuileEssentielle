package fr.perso.huile.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.perso.huile.model.Plante;

public interface IDAOPlante extends JpaRepository<Plante, Integer> {
	
public List<Plante> findByHuileIsNull();

}
