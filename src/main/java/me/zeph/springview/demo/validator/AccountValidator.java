package me.zeph.springview.demo.validator;

import me.zeph.springview.demo.domain.Account;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component
public class AccountValidator implements Validator {
	@Override
	public boolean supports(Class<?> clazz) {
		return Account.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmpty(errors, "name", "NotEmpty.account.name");
		ValidationUtils.rejectIfEmpty(errors, "password", "NotEmpty.account.password");
	}
}
