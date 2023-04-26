package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class indexController {
	
	@GetMapping("/")
	public String index() {
		
		return "index";
	}
	
	@PostMapping("/register")
	public String userRegistration(@ModelAttribute User user , Model model) {
		System.out.println(user.toString());
		//validate
		System.out.println(user.getNome());
		System.out.println(user.getCognome());
		System.out.println(user.getEmail());
		System.out.println(user.getPassword());
		model.addAttribute("nome" , user.getNome());
		model.addAttribute("cognome" , user.getCognome());
		return "Benvenuto";
	}

}
