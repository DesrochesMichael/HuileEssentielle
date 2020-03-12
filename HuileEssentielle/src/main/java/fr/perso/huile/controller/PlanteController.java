package fr.perso.huile.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import fr.perso.huile.DAO.IDAOPlante;

@Controller
public class PlanteController {

	@Autowired
	IDAOPlante daoPlante;
	
	@GetMapping("/Plantes")
	public String findall(Model model) {
		model.addAttribute("plantes", daoPlante.findAll());

		return "Plantes";
	}
}
