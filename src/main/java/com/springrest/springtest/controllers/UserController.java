package com.springrest.springtest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springtest.dto.userDetailDtro;
import com.springrest.springtest.entities.User;
import com.springrest.springtest.repositories.userRepository;
import com.springrest.springtest.service.userService;
import com.springrest.springtest.service.userServiceImpl;

@CrossOrigin("*") 
@RestController
@RequestMapping("/user")
public class UserController {

	
	
	@Autowired
	userServiceImpl userService;
	
	
	
	
	
	
	@GetMapping("/getAll")
	public List<User> getAllUser(){
	  return userService.getAllUser();
	}
	
	
	@PostMapping("/Add")
	public User postUser(@RequestBody userDetailDtro user) {
		return userService.postUser(user);

	}
	
	
	
	
	


	

	
	
}
