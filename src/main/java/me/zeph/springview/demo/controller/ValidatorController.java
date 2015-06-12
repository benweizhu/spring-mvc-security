package me.zeph.springview.demo.controller;

import me.zeph.springview.demo.domain.Account;
import me.zeph.springview.demo.validator.AccountValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
public class ValidatorController {

	@Autowired
	private AccountValidator accountValidator;

	public static final String VALIDATOR = "validator";
	public static final String VALIDATOR_SUCCESS = "validator-success";


	@RequestMapping(value = "validator", method = GET)
	public String view(Account account) {
		return VALIDATOR;
	}

	@RequestMapping(value = "validator", method = POST)
	public String commit(Account account, Errors errors) {
		accountValidator.validate(account, errors);
		return errors.hasErrors() ? VALIDATOR : VALIDATOR_SUCCESS;
	}
}
