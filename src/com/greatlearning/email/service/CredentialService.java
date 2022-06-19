package com.greatlearning.email.service;


public class CredentialService {
	 private String fullName;
	private String department;

	public CredentialService(String fullName, String department) 
	  { 
		  
	 this.fullName = fullName;
	 this.department = department;
	  }
	
	public String displayCredential() {
		CredentialServiceImp credSer = new CredentialServiceImp();
		System.out.println(credSer.generateEmailAddress(fullName,department));
		return null;
		
//		Dear Harshit your generated credentials are as follows
//		Email ---> harshitchoudary@tech.abc.com
//		Password ---> 181E@wFT
	}
}
