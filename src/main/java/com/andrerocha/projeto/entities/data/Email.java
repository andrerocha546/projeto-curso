package com.andrerocha.projeto.entities.data;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.andrerocha.projeto.entities.data.exception.DataException;

public class Email {

	private String email;

	public Email(String email) {
		this.email = isValidEmail(email);
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	private static boolean isValidEmailAddressRegex(String email) {
	    boolean isEmailIdValid = false;
	    if (email != null && email.length() > 0) {
	        String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
	        Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
	        Matcher matcher = pattern.matcher(email);
	        if (matcher.matches()) {
	            isEmailIdValid = true;
	        }
	    }
	    return isEmailIdValid;
	}
	
	private String isValidEmail(String email) {
		if (!isValidEmailAddressRegex(email) || email == null) {
			throw new DataException("Email " + email + " não é valido");
		}
		return email;
	}

}