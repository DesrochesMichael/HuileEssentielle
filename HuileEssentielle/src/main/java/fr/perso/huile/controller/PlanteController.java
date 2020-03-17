package fr.perso.huile.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import fr.perso.huile.DAO.IDAOPlante;
import fr.perso.huile.model.Plante;

@Controller
public class PlanteController {

	@Autowired
	IDAOPlante daoPlante;

	@GetMapping("/Plantes")
	public String getListe(Model model) {
		model.addAttribute("Plantes", daoPlante.findAll());
		return "Plantes";
	}

	@GetMapping("/PlanteAjout")
	public String getAjout(Model model) {
		model.addAttribute("Plante", new Plante());
		return "PlanteAjout";
	}

	@PostMapping("/PlanteAjout")
	public String postAjout(@ModelAttribute Plante plante) {
		daoPlante.save(plante);
		return "redirect:Plantes";
	}

}
