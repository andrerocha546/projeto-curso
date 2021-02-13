package com.andrerocha.projeto.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.andrerocha.projeto.builders.AdminBuilder;
import com.andrerocha.projeto.builders.UserBuilder;
import com.andrerocha.projeto.entities.Admin;
import com.andrerocha.projeto.entities.User;
import com.andrerocha.projeto.services.AdminService;
import com.andrerocha.projeto.services.UserService;

@Configuration
@Profile("test")
public class Instantiation {

	
	public static void main(String[] args) {

		UserService userService = new UserService();
		AdminService adminService = new AdminService();
		
		User user = new UserBuilder()
				.setName("Andre Santos Rocha")
				.setEmail("andrerocha546@gmail.com")
				.setPassword("Asdsr11941918")
				.getResult();
		Admin admin = new AdminBuilder()
				.setName("Andre Rocha")
				.setEmail("andrerocha546@gmail.com")
				.setPassword("Asdsr11941918")
				.getResult();
		
		userService.insert(user);
		adminService.insert(admin);
	}

}
