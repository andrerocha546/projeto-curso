package com.andrerocha.projeto.builders;

public interface Builder {
	
	Builder reset();
	Builder setName(String name);
	Builder setEmail(String email);
	Builder setPassword(String password);

}
