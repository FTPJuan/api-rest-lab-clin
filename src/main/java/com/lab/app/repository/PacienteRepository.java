package com.lab.app.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.lab.app.entity.*;

public interface PacienteRepository extends MongoRepository<Paciente, String> {
	
	public Optional<Paciente> findByIdentificacion(String identificacion);

}
