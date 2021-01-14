package com.andrerocha.projeto.entities.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.andrerocha.projeto.entities.User;
import com.andrerocha.projeto.entities.repositories.UserRepository;

public class UserService {

	@Autowired
	private UserRepository repository;

	public User insert(User user) {
		return repository.save(user);
	}

}
