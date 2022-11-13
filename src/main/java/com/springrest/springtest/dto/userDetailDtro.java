package com.springrest.springtest.dto;



public class userDetailDtro {

	private String firstName;
	private String LastName;
	private String bio;
	private Integer userType;
	private Integer experience;
	private String DomainName;
	
	
	
	public String getDomainName() {
		return DomainName;
	}
	public void setDomainName(String domainName) {
		DomainName = domainName;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public String getBio() {
		return bio;
	}
	
	public Integer getUserType() {
		return userType;
	}
	public Integer getExperience() {
		return experience;
	}
	public void setUserType(Integer userType) {
		this.userType = userType;
	}
	public void setExperience(Integer experience) {
		this.experience = experience;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public void setBio(String bio) {
		this.bio = bio;
	}
	
	
}

