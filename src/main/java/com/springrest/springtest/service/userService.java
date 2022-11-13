package com.springrest.springtest.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springtest.dto.userDetailDtro;
import com.springrest.springtest.entities.User;

@Service
public class userService implements userServiceImpl {

	@Autowired
	com.springrest.springtest.repositories.userRepository userRepository;


	
	public List<User> getAllUser(){
		return userRepository.findAll();	
	}
	
	
	
	public userDetailDtro postUser(userDetailDtro user) {
		
     	User u=new User();
    	u.setUserName(user.getFirstName()+" "+user.getLastName());
		u.setFirstName(user.getFirstName());
		u.setLastName(user.getLastName());
//		u.setBio(user.getBio());
//		u.setExperience(user.getExperience());
//		u.setUserType(user.getUserType());
//		u.setDomainName(user.getDomainName());
//		u.setEnrolledCourse(new ArrayList<>());
		
    	userRepository.save(u);
		
		
		return null;
	}
	
	
	//not working
//	public void addintrest(intrest itdto) {
//		iRepository1.save(itdto);
//        
//	}


//	@Override
//	public List<Courses> getEnrolledCourses(long id) {
//		
//		List<Cart> list=cart.getCartByuserID(id);
//		Optional<User> intopt = userRepository.findById(id);
//		
//		for(Cart c :list) {
//	    	intopt.get().getEnrolledCourse().add(c.getCouse());
//		}
//		
//		userRepository.save(intopt.get());
//		
//		return intopt.get().getEnrolledCourse();
//	}
//
//
//
//	public userUpdateDto updateUser(long id, userUpdateDto user) {
//		 User u = userRepository.findById(id).get();
//	                
//		u.setBio(user.getBio());
//		u.setExperience(user.getExperience());
//		u.setUserType(user.getUserType());
//		
//		userRepository.save(u);
//		
//	     
//		return null;
//	}



//	@Override
//	public List<Courses> getRecommend(long id) {
//		String dname = userRepository.findById(id).get().getDomainName();
//		List<Courses> list=new ArrayList<>();
//		
//		for(Courses c:courseRepository.findAll()) {
//			if(c.getDomainName().equals(dname)) {
//				list.add(c);
//			}
//		}
//		
//		return list;
//	}

}
