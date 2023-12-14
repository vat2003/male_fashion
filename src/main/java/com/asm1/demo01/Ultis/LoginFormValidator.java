package com.asm1.demo01.Ultis;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.asm1.demo01.model.Users;

@Component
public class LoginFormValidator implements Validator {
	@Override
	public boolean supports(Class<?> clazz) {
	    return Users.class.isAssignableFrom(clazz);
	}

    @Override
    public void validate(Object target, Errors errors) {
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email", "NotBlank.users.email");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "passwords", "NotBlank.users.passwords");

    }
}
