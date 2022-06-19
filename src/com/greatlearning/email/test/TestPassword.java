package com.greatlearning.email.test;

public class TestPassword {
	private static String randomPassword(int length) {
		String passwordSet= "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
		char[] password=new char[length];
		for(int i=0;i<length;i++) {
			int rand=(int) (Math.random()*passwordSet.length());
			password[i]=passwordSet.charAt(rand);
		}
		return new String(password);
	}
	

public static void main(String Args[])
{
	
	System.out.println("Random Credials:-"+randomPassword(12));
}
}