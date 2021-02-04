package com.andrerocha.projeto.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.andrerocha.projeto.entities.Person;
import com.andrerocha.projeto.repositories.PersonRepository;

public class PersonService {
	
	@Autowired
	private PersonRepository repository;
	
	public List<Person> findAll() {
		List<Person> list = repository.findAll();
		return list;
	}

}
