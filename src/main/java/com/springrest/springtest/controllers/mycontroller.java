package com.springrest.springtest.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class mycontroller {
	
	
	
	@GetMapping("/home")
	public String helloworld() {
		return "hii this is my first spring";
	}
	

}
