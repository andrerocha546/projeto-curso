package com.andrerocha.projeto.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andrerocha.projeto.entities.Person;
import com.andrerocha.projeto.repositories.PersonRepository;
import com.andrerocha.projeto.services.exception.ObjectNotFoundException;

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
	
	public Person findById(Integer id) {
		Optional<Person> person = repository.findById(id);
		return person.orElseThrow(() -> new ObjectNotFoundException("Usuário não encontrado"));
	}

}
