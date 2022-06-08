package com.p2;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Demo {
	
	public boolean validate(String name, String mobileNum, String aadharCard) {
		// validation done here
		
	if(!Pattern.matches("[0-9]{12}", aadharCard))
		return false;
	
	if(!Pattern.matches("[6789]{1}[0-9]{9}", mobileNum))
		return false;
	else
		return true;
	
	}
	


	

	
	public static void main(String[] args) {
		Demo d1 = new Demo();
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter Your Name");
	String enteredName =	in.nextLine();
	
	System.out.println("Enter Your Mobile Number");
	String enteredMobile = in.nextLine();
	
	System.out.println("Enter Your Adharcard Number");
	String enteredAdhar  = in.nextLine();
		
	if(d1.validate(enteredName, enteredMobile, enteredAdhar)) {
		Citizen citizen = new Citizen();  // creating new object
		
		citizen.setName(enteredName);
		citizen.setAadharNumber(enteredAdhar);
		citizen.setMobileNumber(enteredMobile);
		
		
		System.out.println("Name : " + citizen.getName());
		System.out.println("Aadharcard :" +citizen.getAadharNumber());
		System.out.println("Mobile Number :"+citizen.getMobileNumber());
	}else {
		
		System.out.println("Invalid details :(");
	}
	
	
	}

}
