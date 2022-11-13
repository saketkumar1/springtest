package com.springrest.springtest.service;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.springrest.springtest.dto.userDetailDtro;
import com.springrest.springtest.entities.User;

@Repository
public interface userServiceImpl {

	
    public List<User> getAllUser();
	
	public User postUser(userDetailDtro user) ;
	
}
