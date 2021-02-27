package com.andrerocha.projeto.dto;

import java.io.Serializable;

import com.andrerocha.projeto.entities.Admin;
import com.andrerocha.projeto.entities.Person;

public class PersonDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private Integer isAdmin;
	private String name;
	private String email;
	
	public PersonDTO(Person person) {
		this.id = person.getId();
		this.isAdmin = typeOfPerson(person);
		this.name = person.getName().getName();
		this.email = person.getEmail().getEmail();
	}

	private Integer typeOfPerson(Person person) {
		if (person instanceof Admin) {
			return 1;
		}
		return 0;
	}

	public PersonDTO() {
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public Integer getIsAdmin() {
		return isAdmin;
	}
	
}
