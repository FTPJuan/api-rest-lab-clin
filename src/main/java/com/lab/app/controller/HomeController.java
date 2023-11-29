package com.lab.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.PostMapping;

import com.lab.app.entity.Paciente;
import com.lab.app.entity.Medico;

import com.lab.app.repository.*;



@Controller
public class HomeController {
	
	@Autowired
	private MedicoRepository IMed;
	@Autowired
	private PacienteRepository IPac;
	
	
	
	//para que se muestre el index o me envie al index
	@GetMapping("/index")
	public String index(Model model) {
		return "index";
	}
	
	@GetMapping("/login")
	public String loginIndex(Model model) {
		return "login";
	}
	
	@GetMapping("/doctor")
	public String doctor(Model model) {
		return "doctor";
	}
	
	@GetMapping("/about")
	public String about(Model model) {
		return "about";
	}
	
	@GetMapping("/blog")
	public String blog(Model model) {
		return "blog";
	}
	
	@GetMapping("/contact")
	public String contact(Model model) {
		return "contact";
	}
	
	@GetMapping("/depatments")
	public String depatments(Model model) {
		return "depatments";
	}
	
	@GetMapping("/loginPaciente")
	public String login(Model model, @ModelAttribute Paciente paciente) {
		model.addAttribute("pac", paciente);
		return "loginPaciente";
	}
	
	@PostMapping("/loginPaciente")
	public String home(Model model, @ModelAttribute Paciente paciente) {
		
		for(Paciente item :IPac.findAll()) {
		
			if(item.getIdentificacion().equals(paciente.getIdentificacion())) {
				if(paciente.getIdentificacion() != ""){
					model.addAttribute("paciente", IPac.findByIdentificacion(paciente.getIdentificacion()).get());
					return "homePaciente";
				}
			}
		}
		return "redirect:/loginPaciente";
	}
	
	
	
	
	
	
	//Medico
	@GetMapping("/loginMedico")
	public String login(Model model, @ModelAttribute Medico medico) {
		model.addAttribute("med", medico);
		return "loginMedico";
	}
	
	@PostMapping("/loginMedico")
	public String login(@ModelAttribute Medico medico) {
		
		for(Medico item :IMed.findAll()) {
			
			if(item.getUsername().equals(medico.getUsername())) {
				if(item.getPassword().equals(medico.getPassword())) {
					return "redirect:/homeMedico";
				}
			}
		}
		return "redirect:/loginMedico";
	}
	
	

	@GetMapping("/homeMedico")
	public String home(Model model) {
		model.addAttribute("paciente", IPac.findAll());
		return "homeMedico";
	}
	

}
