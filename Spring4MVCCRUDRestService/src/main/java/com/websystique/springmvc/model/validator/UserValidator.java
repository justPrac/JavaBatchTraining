package com.websystique.springmvc.model.validator;

import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.websystique.springmvc.model.User;

public class UserValidator implements Validator{

	//@Override
	public boolean supports(Class clazz) {
		return User.class.equals(clazz);
	}

	
	
	//@Override
	public void validate(Object obj, Errors e) {
		User userData = (User) obj;
		String name = userData.getName();
				System.out.println("Validation called--->");
		if (!StringUtils.hasText(name)) {
			System.out.println("Validation called");
				e.reject("USRNAME", "USERNAME");
		}
	}
	
}
