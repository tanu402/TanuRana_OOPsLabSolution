package com.greatlearning.email.main;
import java.util.Scanner;

import com.greatlearning.email.model.*;
import com.greatlearning.email.service.*;

public class main {
	
	private static String deptname() {
		Scanner a = new Scanner(System.in);

		int D = a.nextInt();
		String Dept = null;
	switch (D) {
	case 1:
		System.out.println("Technical");
		Dept = "Technical";
		return "Technical";
	case 2:
		System.out.println("Admin");
		Dept = "Admin";
		return "Admin";
	case 3:
		System.out.println("HR");
		Dept = "HR";
		return "HR";
	case 4:
		System.out.println("Legal");
		Dept = "Legal";
		return "Legal";
	}
	return Dept;
	}

	public static void main(String Args[])
	{
		String Firstname ,Lastname, department;
		Scanner b = new Scanner(System.in);
		System.out.println("Please select the value of department");
		System.out.println("1.Technical");
		System.out.println("2.Admin");
		System.out.println("3.HR");
		System.out.println("4.Legal");
		department = deptname();
		System.out.println("Enter your first name");
		Firstname = b.next();
		System.out.println("Enter your last name");
		Lastname = b.next();
		
		
		Employee emp = new Employee(Firstname, Lastname);
		String name = emp.getName();
		System.out.println(name);
		CredentialService cred = new CredentialService(Firstname ,name, department);
		cred.displayCredential();
	}

}
