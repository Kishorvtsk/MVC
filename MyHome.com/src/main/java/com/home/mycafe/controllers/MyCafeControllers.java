package com.home.mycafe.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class MyCafeControllers {
	//return the welcome page
	@RequestMapping("/cafe")
	public String showWelcomePage(Model model) {
		
		return "welcome-page";
	}
	
	@RequestMapping("/processOrder")
	public String processOrder(HttpServletRequest request,Model model) {
		
		// handel the data recieved from the user
		String userEnteredValue = request.getParameter("foodtype");
		
		//	adding the captured value to the model
		model.addAttribute("userInput", userEnteredValue);
		
		// set the user data with the model object and send it to view
		return "process-order";
		
	}
	
}
