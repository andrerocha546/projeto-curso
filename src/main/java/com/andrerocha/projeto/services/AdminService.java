package com.andrerocha.projeto.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.andrerocha.projeto.entities.Admin;
import com.andrerocha.projeto.repositories.AdminRepository;

public class AdminService {
	
	@Autowired
	private AdminRepository repository;
	
	public Admin insert(Admin admin) {
		return repository.save(admin);
	}

}
