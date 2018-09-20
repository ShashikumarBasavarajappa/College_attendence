package dev.devlops.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginSucess {

	@RequestMapping("/login")
	public String loginsucess() {		
		
		return "home_page";
	}
}
