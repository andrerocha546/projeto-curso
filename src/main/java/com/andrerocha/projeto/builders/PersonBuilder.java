package com.andrerocha.projeto.builders;

public interface PersonBuilder {
	
	PersonBuilder reset();
	PersonBuilder setName(String name);
	PersonBuilder setEmail(String email);
	PersonBuilder setPassword(String password);

}
