package com.andrerocha.projeto.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.andrerocha.projeto.entities.Admin;
import com.andrerocha.projeto.repositories.PersonRepository;

public class AdminService {
	
	@Autowired
	private PersonRepository repository;
	
	public Admin insert(Admin admin) {
		return repository.save(admin);
	}

}
