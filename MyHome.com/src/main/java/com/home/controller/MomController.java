package com.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/mom")
public class MomController {
	
	@ResponseBody
	@RequestMapping("/sugar")
	public String giveSugar() {
		return "Ok here is your sugar";
	}
	
	@ResponseBody
	@RequestMapping("/book")
	public String getBooks() {
		System.out.println("this is getBooks()....");
		return "Math Book";
	}

}
