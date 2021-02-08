package com.andrerocha.projeto.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.andrerocha.projeto.entities.data.PersonalData;

@Entity
public class User implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private PersonalData personalData;

	public User() {
	}

	public User(PersonalData personalData) {
		this.id = null;
		this.personalData = personalData;
	}

	public Integer getId() {
		return id;
	}

	public PersonalData getPersonalData() {
		return personalData;
	}

	public void setPersonalData(PersonalData personalData) {
		this.personalData = personalData;
	}

}
