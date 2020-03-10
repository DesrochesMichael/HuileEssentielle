package fr.perso.huile.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.perso.huile.model.HuileEssentielle;

public interface IDAOHuileEssentielle extends JpaRepository<HuileEssentielle, Integer> {
	

}
