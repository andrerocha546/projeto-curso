package com.andrerocha.projeto.entities;

import java.io.Serializable;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.andrerocha.projeto.entities.data.personal.PersonalData;

@Entity
@Table(name = "tb_admin")
public class Admin implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Embedded
	private PersonalData personalData;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	public Admin() {
	}

	public Admin(PersonalData personalData) {
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
