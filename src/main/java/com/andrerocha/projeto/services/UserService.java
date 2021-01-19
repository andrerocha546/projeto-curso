package com.andrerocha.projeto.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.andrerocha.projeto.entities.User;
import com.andrerocha.projeto.repositories.PersonRepository;

public class UserService {

	@Autowired
	private PersonRepository repository;

	public User insert(User user) {
		return repository.save(user);
	}

}
