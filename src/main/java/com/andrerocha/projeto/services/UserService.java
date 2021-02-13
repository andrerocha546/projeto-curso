package com.andrerocha.projeto.services;

import org.springframework.stereotype.Service;

import com.andrerocha.projeto.entities.User;
import com.andrerocha.projeto.repositories.UserRepository;

@Service
public class UserService {

	private UserRepository repository = new UserRepository();

	public User insert(User user) {
		return repository.register(user);
	}

}
