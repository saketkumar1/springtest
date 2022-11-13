package com.springrest.springtest.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springtest.dto.userDetailDtro;
import com.springrest.springtest.entities.User;
import com.springrest.springtest.repositories.userRepository;

@Service
public class userService implements userServiceImpl {

	@Autowired
	 userRepository userrepo;


	
	public List<User> getAllUser(){
		return userrepo.findAll();	
	}
	
	
	
	public User postUser(userDetailDtro user) {
		
     	User u=new User();
    	u.setUserName(user.getFirstName()+" "+user.getLastName());
		u.setFirstName(user.getFirstName());
		u.setLastName(user.getLastName());
		
		userrepo.save(u);
		
		
		return u;
	}
	
	


}
