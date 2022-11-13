package com.springrest.springtest.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "student")
public class User {


	@Id
	@Column(name = "id")
//	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long userId;
	private String userName;
	private String firstName;
	private String lastName;
//	private String bio;
//	private Integer userType;
//	private Integer experience;
//	private String DomainName;
//	lkdf;sldkfs;ml
	
	public User(long userId, String userName, String firstName, String lastName) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}




	public long getUserId() {
		return userId;
	}
	
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	
	
	

//	public User(long userId, String userName, String firstName, String lastName, String bio, Integer userType,
//			Integer experience, String domainName) {
//		super();
//		this.userId = userId;
//		this.userName = userName;
//		this.firstName = firstName;
//		this.lastName = lastName;
//		this.bio = bio;
//		this.userType = userType;
//		this.experience = experience;
//		DomainName = domainName;
////		this.enrolledCourse = enrolledCourse;
//	}
//
//	public String getDomainName() {
//		return DomainName;
//	}
//
//	public void setDomainName(String domainName) {
//		DomainName = domainName;
//	}
//
//	public User() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//
//	public Integer getUserType() {
//		return userType;
//	}
//
//	public Integer getExperience() {
//		return experience;
//	}
//
//	public void setUserType(Integer userType) {
//		this.userType = userType;
//	}
//
//	public void setExperience(Integer experience) {
//		this.experience = experience;
//	}
//
//	public String getBio() {
//		return bio;
//	}
//
//	public void setBio(String bio) {
//		this.bio = bio;
//	}
//
////	public List<Courses> getEnrolledCourse() {
////		return enrolledCourse;
////	}
////
////	public void setEnrolledCourse(List<Courses> enrolledCourse) {
////		this.enrolledCourse = enrolledCourse;
////	}
//
//
//	public long getUserId() {
//		return userId;
//	}
//
//	public String getUserName() {
//		return userName;
//	}
//
//	public String getFirstName() {
//		return firstName;
//	}
//
//	public String getLastName() {
//		return lastName;
//	}
//
//	public void setUserId(long userId) {
//		this.userId = userId;
//	}
//
//	public void setUserName(String userName) {
//		this.userName = userName;
//	}
//
//	public void setFirstName(String firstName) {
//		this.firstName = firstName;
//	}
//
//	public void setLastName(String lastName) {
//		this.lastName = lastName;
//	}
//
//	@Override
//	public String toString() {
//		return "User [userId=" + userId + ", userName=" + userName + ", firstName=" + firstName + ", lastName="
//				+ lastName + "]";
//	}

}

