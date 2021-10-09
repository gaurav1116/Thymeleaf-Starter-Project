package com.devopsbuddy;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {
	
	@GetMapping("/welcome")
	public String Welcome(Model model) {
		
		model.addAttribute("message"," Welcome to our Website" );
		return("index");
	}
	
	@GetMapping("/homepage")
	public String style() {
		
		return("add-css-to-js");
	}
}
