package com.andrerocha.projeto.resources;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.andrerocha.projeto.entities.Person;
import com.andrerocha.projeto.services.PersonService;

@RestController
@RequestMapping(value = "/users")
public class PersonResource {
	
	private PersonService service = new PersonService();
	
	@PostMapping
	public ResponseEntity<Void> insert(@RequestBody Person person) {
		
	}
	
	@GetMapping
	public ResponseEntity<List<Person>> findAll() {
		List<Person> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}

}
