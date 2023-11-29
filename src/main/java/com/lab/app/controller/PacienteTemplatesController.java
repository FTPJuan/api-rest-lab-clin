package com.lab.app.controller;


import com.lab.app.entity.*;
import com.lab.app.exception.NotFoundException;
import com.lab.app.repository.*;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/paciente")
public class PacienteTemplatesController {
	
	@Autowired
    private PacienteRepository pacienteRepository;

    @GetMapping("/")
    public String pacienteListTemplate(Model model) {
        model.addAttribute("paciente", pacienteRepository.findAll());
        return "homeMedico";
    }

    @GetMapping("/new")
    public String pacienteNewTemplate(Model model) {
        model.addAttribute("paciente", new Paciente());
        return "agregarResultado";
    }

    @GetMapping("/edit/{id}")
    public String pacienteEditTemplate(@PathVariable("id") String id, Model model) {
        model.addAttribute("paciente", pacienteRepository.findById(id).orElseThrow(() -> new NotFoundException("Paciente no encontrado")));
        return "actualizarResultado";
    }
    
	
	
    @GetMapping("/view/{id}")
    public String pacienteViewTemplate(@PathVariable("id") String id, Model model) {
        model.addAttribute("paciente", pacienteRepository.findById(id).orElseThrow(() -> new NotFoundException("Paciente no encontrado")));
        return "visualizarResultado";
    }

    @PostMapping("/save")
    public String pacienteSaveProcess(@ModelAttribute("paciente") Paciente paciente) {
        if (paciente.getId().isEmpty()) {
        	paciente.setId(null);
        }
        pacienteRepository.save(paciente);
        return "redirect:/paciente/";
    }

    @GetMapping("/delete/{id}")
    public String pacienteDeleteProcess(@PathVariable("id") String id) {
    	pacienteRepository.deleteById(id);
        return "redirect:/paciente/";
    }
    
    @GetMapping("/agendar_cita")
    public String agendarCitaTemplate(Model model) {
        return "agendar_cita";

    
    }
}
