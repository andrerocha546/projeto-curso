package com.andrerocha.projeto.services;

import com.andrerocha.projeto.entities.Admin;
import com.andrerocha.projeto.repositories.AdminRepository;

public class AdminService {
	
	private AdminRepository repository = new AdminRepository();
	
	public Admin insert(Admin admin) {
		return repository.register(admin);
	}

}
