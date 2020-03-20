package fr.perso.huile.controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import fr.perso.huile.DAO.IDAOEtape;
import fr.perso.huile.DAO.IDAOHuileEssentielle;
import fr.perso.huile.model.Etape;

@Controller
public class EtapesController {

	@Autowired
	IDAOEtape daoEtape;

	@Autowired
	IDAOHuileEssentielle daoHuile;

	@Transactional
	@GetMapping("/Etapes")
	public String getEtape(@RequestParam int id, Model model) {
		model.addAttribute("Etapes", daoEtape.findByHuileIdOrderByOrdreAsc(id));
		model.addAttribute("id", id);
		model.addAttribute("Etape", new Etape());
		model.addAttribute("huile", daoHuile.findById(id).get());
		return "Etapes";

	}

	@PostMapping("/Etapes")
	public String postEtape(@ModelAttribute Etape etape, @RequestParam int id) {
		Etape et = new Etape();
		et.setHuile(daoHuile.findById(id).get());
		et.setLibelle(etape.getLibelle());
		et.setImage(etape.getImage());
		et.setOrdre(etape.getOrdre());
		
		daoEtape.save(et);

		return "redirect:Etapes?id=" + id;
	}

	@GetMapping("/EtapesEdit")
	public String getEdit(Model model, @RequestParam int id) {
		Etape etape = daoEtape.findById(id).get();
		model.addAttribute("Etape", etape);
		model.addAttribute("Etapes", daoEtape.findByHuileIdOrderByOrdreAsc(id));
		model.addAttribute("id", id);
		model.addAttribute("huile", daoHuile.findById(id).get());
		return "Etapes";
	}

	@PostMapping("/EtapesEdit")
	public String postEdit(@ModelAttribute Etape etape, @RequestParam int id) {
		daoEtape.save(etape);
		return "redirect:Etapes?id=" + id;
	}
}
