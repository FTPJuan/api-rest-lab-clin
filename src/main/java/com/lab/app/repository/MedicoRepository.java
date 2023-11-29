package com.lab.app.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.lab.app.entity.*;

public interface MedicoRepository extends MongoRepository<Medico, String> {
	
	public Optional<Medico> findByUsername(String username);

}
