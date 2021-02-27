package com.andrerocha.projeto.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andrerocha.projeto.entities.Person;
import com.andrerocha.projeto.repositories.PersonRepository;

@Service
public class PersonService {

	@Autowired
	private PersonRepository repository;

	public Person insert(Person person) {
		return repository.save(person);
	}
	
	public List<Person> findAll() {
		return repository.findAll();
	}

}
