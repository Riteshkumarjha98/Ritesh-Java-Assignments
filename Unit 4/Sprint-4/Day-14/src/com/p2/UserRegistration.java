package com.p2;

import java.util.Scanner;

public class UserRegistration {
	
	void registerUser(String username, String userCountry) throws InvalidCountryException {
		
		if(userCountry.equals("India")) {
			System.out.println("User registration done successfully");
		}
		
		else {
			
			InvalidCountryException ICE = new InvalidCountryException("User Outside India Cannot Be Registered");
			throw ICE;
		}
		
	}
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Your Name: ");
		String username = input.next();
		
		System.out.println("Enter Your Country:: ");
		String userCountry = input.next();
		
		UserRegistration userRegistration = new UserRegistration();
		try {
			userRegistration.registerUser(username, userCountry);
		}
		catch(InvalidCountryException ice) {
			System.out.println(ice.getMessage());
		}
	}
}