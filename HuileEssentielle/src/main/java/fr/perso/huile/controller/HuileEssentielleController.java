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
import fr.perso.huile.DAO.IDAOPlante;
import fr.perso.huile.DAO.IDAOPropriete;
import fr.perso.huile.DAO.IDAOUtilisation;
import fr.perso.huile.model.Categorie;
import fr.perso.huile.model.Etape;
import fr.perso.huile.model.HuileEssentielle;
import fr.perso.huile.model.Plante;
import fr.perso.huile.model.Propriete;
import fr.perso.huile.model.Utilisation;
import fr.perso.huile.model.Wrapper;

@Controller
public class HuileEssentielleController {

	@Autowired
	private IDAOHuileEssentielle daoHuile;

	@Autowired
	private IDAOCategorie daoCat;

	@Autowired
	private IDAOPropriete daoProp;

	@Autowired
	private IDAOUtilisation daoUtil;

	@Autowired
	private IDAOPlante daoPlante;

	@GetMapping("/HuilesEssentielles")
	public String findall(Model model) {
		model.addAttribute("huiles", daoHuile.findAll());
		return "HuilesEssentielles";
	}

	@GetMapping("/HuileEssentielleAjout")
	public String getAdd(Model model) {
		model.addAttribute("HuileEssentielle", new HuileEssentielle());
		Wrapper wrap = new Wrapper();
		for (int i = 0; i < 3; i++) {
			wrap.addPropriete(new Propriete());
			wrap.addCategorie(new Categorie());
			wrap.addUtilisation(new Utilisation());
			wrap.addEtape(new Etape());

		}
		model.addAttribute("wrap", wrap);
		model.addAttribute("plantes", daoPlante.findAll());
		model.addAttribute("plante", new Plante());
		return "HuileEssentielleAjout";
	}

	@GetMapping("/HuileEssentielleEdit")
	public String getEdit(Model model, @RequestParam int id) {
		HuileEssentielle huile = daoHuile.findById(id).get();
		model.addAttribute("HuileEssentielle", huile);
		Wrapper wrap = new Wrapper();
		wrap.setCategories(huile.getCategories());
		wrap.setEtapes(huile.getEtapes());
		wrap.setProprietes(huile.getProprietes());
		wrap.setUtilisations(huile.getUtilisations());
		model.addAttribute("wrap", wrap);
		model.addAttribute("plantes", daoPlante.findAll());
		model.addAttribute("plante", huile.getPlante());
		return "HuileEssentielleAjout";
	}

	@PostMapping("/HuileEssentielleAjout")
	public String saveAdd(@ModelAttribute HuileEssentielle huile, @ModelAttribute Wrapper wrap) {
		huile.setProprietes(wrap.getProprietes());
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

	@GetMapping("/HuileEssentielleDetail")
	public String getDetail(@RequestParam int id, Model model) {
		model.addAttribute("HuileEssentielle", daoHuile.findById(id).get());
		return "HuileEssentielleDetail";
	}
}
