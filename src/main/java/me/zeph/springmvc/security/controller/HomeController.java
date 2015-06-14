package me.zeph.springmvc.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

import static org.springframework.web.bind.annotation.RequestMethod.GET;


@Controller
public class HomeController {
	@RequestMapping(value = "/home", method = GET)
	public String home(Principal principal, Model model) {
		model.addAttribute("userName", principal.getName());
		return "home";
	}
}
