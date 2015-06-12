package me.zeph.springview.demo.controller;

import me.zeph.springview.demo.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
public class ValidController {

	public static final String VALID = "valid";
	public static final String VALID_SUCCESS = "valid-success";

	@RequestMapping(value = "valid", method = GET)
	public String view(User user) {
		return VALID;
	}

	@RequestMapping(value = "valid", method = POST)
	public String commit(@Valid User user, Errors errors) {
		return errors.hasErrors() ? VALID : VALID_SUCCESS;
	}
}
