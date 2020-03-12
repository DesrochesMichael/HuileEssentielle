package fr.perso.huile.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import fr.perso.huile.DAO.IDAOCategorie;
import fr.perso.huile.DAO.IDAOHuileEssentielle;
import fr.perso.huile.model.HuileEssentielle;
import fr.perso.huile.model.Utilisation;

@Controller
public class HuileEssentielleController {

	@Autowired
	private IDAOHuileEssentielle daoHuile;

	@Autowired
	private IDAOCategorie daoCat;

	@GetMapping("/HuilesEssentielles")
	public String findall(Model model) {
		model.addAttribute("huiles", daoHuile.findAll());

		return "HuilesEssentielles";
	}

	@GetMapping("/HuileEssentielleAjout")
	public String getAdd(Model model) {
		
		model.addAttribute("HuileEssentielle", new HuileEssentielle());

		return "HuileEssentielleAjout";
	}

	@GetMapping("/HuileEssentielleEdit")
	public String getEdit(Model model, @RequestParam int id) {

		model.addAttribute("HuileEssentielle", daoHuile.findById(id).get());

		model.addAttribute("categories", daoCat.findAll());

		return "HuileEssentielleAjout";
	}

	@PostMapping("/HuileEssentielleAjout")
	public String saveAdd(@ModelAttribute HuileEssentielle huile) {

		daoHuile.save(huile);

		return "redirect:HuilesEssentielles";
	}

	@PostMapping("/HuileEssentielleEdit")
	public String saveEdit(@ModelAttribute HuileEssentielle huile, @RequestParam int id) {
		huile.setId(id);
		daoHuile.save(huile);

		return "redirect:HuilesEssentielles";
	}

	@GetMapping("/HuileEssentielleSup")
	public String getDel(@RequestParam int id) {

		daoHuile.deleteById(id);

		return "redirect:HuilesEssentielles";
	}
}
