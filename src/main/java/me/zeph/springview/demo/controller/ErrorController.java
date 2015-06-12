package me.zeph.springview.demo.controller;

import me.zeph.springview.demo.domain.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.util.StringUtils.isEmpty;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
public class ErrorController {
	public static final String ERROR = "error";
	public static final String ERROR_SUCCESS = "error-success";

	@RequestMapping(value = "error", method = GET)
	public String view(Customer customer) {
		return ERROR;
	}

	@RequestMapping(value = "error", method = POST)
	public String commit(Customer customer, Errors errors) {
		if (isEmpty(customer.getName())) {
			errors.rejectValue("name", "NotEmpty", "name is empty");
		}
		if (isEmpty(customer.getPassword())) {
			errors.rejectValue("password", "NotEmpty", "password is empty");
		}
		//Just for demonstrating reject the object itself
		errors.reject("Invalid", "Customer is invalid");
		return errors.hasErrors() ? ERROR : ERROR_SUCCESS;
	}
}
