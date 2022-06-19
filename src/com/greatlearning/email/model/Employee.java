package com.greatlearning.email.model;

public class Employee {
  private String firstName;
  private String lastName;
 
  public Employee(String firstName, String lastName) 
  { 
	  
 this.firstName = firstName;
 this.lastName = lastName;
  }
  public String getName() {
      return this.firstName + this.lastName;
  }
}
