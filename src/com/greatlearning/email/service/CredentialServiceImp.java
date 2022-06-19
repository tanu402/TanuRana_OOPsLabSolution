package com.greatlearning.email.service;

public class CredentialServiceImp {

	private String email;
	private String password;
	private String department;
	private String fullname;
	
	
	public String generateEmailAddress(String fullName, String department) {
		email = this.fullname+"@"+this.department+".company.com";
		return email;
	};
//	public String  generatePassword() {};
//	public String showCredentials () {
//		
//	};
	
}
