package com.greatlearning.email.service;

public class CredentialServiceImp {

	private String email;
	private String password;
	private String department;
	private String fullname;
	private String firstName;
	
	public CredentialServiceImp(String firstName, String fullName,String department) {
		this.firstName = firstName;
		this.fullname = fullName;
		this.department = department;
	}
	
	public String generateEmailAddress() {
		email = this.fullname+"@"+this.department.toLowerCase()+".company.com";
		return email;
	};
	public String  generatePassword(int length) {
		String passwordSet= "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%";
		char[] pass=new char[length];
		for(int i=0;i<length;i++) {
			int rand=(int) (Math.random()*passwordSet.length());
			pass[i]=passwordSet.charAt(rand);
		}
		password = new String(pass); 
		return password; }
		
	public void showCredentials () {
		email = generateEmailAddress();	
		password = generatePassword(12);
		System.out.println("Dear "+firstName+" your generated credentials are as follows");
		System.out.println("Email ---> "+email);
		System.out.println("Password ---> "+password);
	};
	
}
