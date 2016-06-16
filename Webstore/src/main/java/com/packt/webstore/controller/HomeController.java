package com.packt.webstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String Welcome(Model model){
		model.addAttribute("greeting", "Welcome to the store");
		model.addAttribute("tagline", "nananna");
		
		return "welcome";
	}
}
