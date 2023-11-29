package com.lab.app.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.lab.app.entity.*;
import com.lab.app.exception.NotFoundException;
import com.lab.app.repository.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/api/paciente")
public class PacienteController {
	
	@Autowired
    private PacienteRepository pacienteRepository;

	//mostrar
    @GetMapping("/")
    public List<Paciente> getAllestudiante() {
        return pacienteRepository.findAll();
    }
    
    //mostrar
    @GetMapping("/{id}")
    public Paciente getPacienteById(@PathVariable String id) {
        return pacienteRepository.findById(id).orElseThrow(() -> new NotFoundException("Paciente no encontrado"));
    }
    
    //agregar
    @PostMapping("/")
    public Paciente savePaciente(@RequestBody Map<String, Object> body) {
        ObjectMapper mapper = new ObjectMapper();
        Paciente paciente = mapper.convertValue(body, Paciente.class);
        return pacienteRepository.save(paciente);
    }

    //actualizar
    @PutMapping("/{id}")
    public Paciente updatePaciente(@PathVariable String id, @RequestBody Map<String, Object> body) {
        ObjectMapper mapper = new ObjectMapper();
        Paciente paciente = mapper.convertValue(body, Paciente.class);
        paciente.setId(id);
        return pacienteRepository.save(paciente);
    }

    @DeleteMapping("/{id}")
    public Paciente deletePaciente(@PathVariable String id) {
    	Paciente paciente = pacienteRepository.findById(id).orElseThrow(() -> new NotFoundException("Paciente no encontrado"));
    	pacienteRepository.deleteById(id);
        return paciente;
    }
    
    @GetMapping("/agendar_cita")
    public String mostrarAgendarCita() {
        return "agendar_cita"; // Cambiar a la vista correcta
    }

    
    
}
