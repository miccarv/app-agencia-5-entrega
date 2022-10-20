package com.example.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@GetMapping("/promocoes")
    public String promocoes() {
    	return "promocoes";
	}
	
	@GetMapping("/destino")
    public String destino() {
    	return "destino";
	}
	
	@GetMapping("/contato")
    public String contato() {
    	return "contato";
	}

}
