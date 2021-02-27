package com.andrerocha.projeto.resources;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.andrerocha.projeto.dto.PersonDTO;
import com.andrerocha.projeto.entities.Person;
import com.andrerocha.projeto.services.PersonService;

@RestController
@RequestMapping(value = "/persons")
public class PersonResource {
	
	@Autowired
	private PersonService service;
	
	@GetMapping
	public ResponseEntity<List<PersonDTO>> findAll() {
		List<Person> list = service.findAll();
		List<PersonDTO> listDto = list.stream()
				.map(person -> new PersonDTO(person)).collect(Collectors.toList());
		return ResponseEntity.ok().body(listDto);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<PersonDTO> findById(@PathVariable Integer id) {
		Person person = service.findById(id);
		PersonDTO personDto = new PersonDTO(person);
		return ResponseEntity.ok().body(personDto);
	}

}
