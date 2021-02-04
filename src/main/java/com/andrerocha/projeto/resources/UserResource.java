package com.andrerocha.projeto.resources;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.andrerocha.projeto.entities.User;
import com.andrerocha.projeto.services.UserService;

//@RestController
//@RequestMapping(value = "/users")
public class UserResource {
	
	private UserService service = new UserService();
	
	@GetMapping
	public ResponseEntity<List<User>> findAll() {
		List<User> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}

}
