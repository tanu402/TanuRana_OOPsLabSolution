package com.greatlearning.email.service;


public class 

CredentialService {
	 private String fullName;
	private String department;
	private String firstName;

	public CredentialService(String firstName, String fullName, String department) 
	  { 
		  
	 this.fullName = fullName;
	 this.department = department;
	 this.firstName = firstName;
	  }
	
	public void displayCredential() {
		CredentialServiceImp credSer = new CredentialServiceImp(firstName,fullName,department);
		credSer.showCredentials();
	}
}
