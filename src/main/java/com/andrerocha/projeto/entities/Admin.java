package com.andrerocha.projeto.entities;

import java.io.Serializable;

import javax.persistence.Entity;

import com.andrerocha.projeto.entities.data.PersonalData;

@Entity
public class Admin implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private PersonalData personalData;
	
	public Admin() {
	}

	public Admin(PersonalData personalData) {
		this.personalData = personalData;
	}

	public PersonalData getPersonalData() {
		return personalData;
	}

	public void setPersonalData(PersonalData personalData) {
		this.personalData = personalData;
	}
	

}
