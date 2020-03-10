package fr.perso.huile.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import fr.perso.huile.DAO.IDAOHuileEssentielle;

@Controller
public class HuileEssentielleController {

	@Autowired
	private IDAOHuileEssentielle daoHuile;
	
//	@GetMapping("/listeHuiles")
//	public String findall(Model model) {
//		model.addAttribute("huiles", daoHuile.findAll());
//
//		return "listeHuiles";
//
//	@PostMapping("/ajoutHuile")
//	public String save(@ModelAttribute Huile huile) {
//
//		daoHuile.save(huile);
//
//		return "redirect:listeHuile";
//	}
//	
//	
//	@PostMapping("/editHuile")
//	public String saveedit(@ModelAttribute Huile Huile) {
//
//		daoHuile.save(Huile);
//
//		return "redirect:listeHuile";
//	}
//
//	@GetMapping("/supHuile")
//	public String delete(@RequestParam int id) {
//		daoHuile.deleteById(id);
//
//		return "redirect:listeHuile";
//	}
//
//	@GetMapping("/editHuile")
//	public String update(@RequestParam int id, Model model) {
//		model.addAttribute("Huile", daoHuile.findById(id).get());
//		return "ajoutHuile";
//	}
//
//}
//	
}
