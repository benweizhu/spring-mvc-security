package me.zeph.springmvc.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
public class LoginController {
	@RequestMapping(value = "/login", method = GET)
	public String login() {
		return "login";
	}
}
