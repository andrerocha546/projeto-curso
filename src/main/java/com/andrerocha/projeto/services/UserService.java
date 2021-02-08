package com.andrerocha.projeto.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andrerocha.projeto.entities.User;
import com.andrerocha.projeto.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;

	public User insert(User user) {
		return repository.save(user);
	}

	public List<User> findAll() {
		return repository.findAll();
	}

}
