package com.springrest.springtest.service;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.springrest.springtest.dto.userDetailDtro;
import com.springrest.springtest.entities.User;

@Repository
public interface userServiceImpl {

	
public List<User> getAllUser();
	
	public userDetailDtro postUser(userDetailDtro user) ;
	
	
	
//	public void addintrest(intrest intrest);

//	public List<Courses> getEnrolledCourses(long id);

//	public userUpdateDto updateUser(long id, userUpdateDto user);
	
//	public List<Courses> getRecommend(long id);
}
