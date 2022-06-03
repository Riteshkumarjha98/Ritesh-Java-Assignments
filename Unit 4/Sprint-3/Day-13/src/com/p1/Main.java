package com.p1;

import java.util.InputMismatchException;
import java.util.Scanner;

class Main {
	
	public static void main(String args[]) {
	try {
		

	System.out.println("start of main..");
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter num1");
	int num1 = sc.nextInt();
	
	System.out.println("Enter num2");
	int num2 = sc.nextInt();
	
	String message = null;
	
	int num3 = num1 / num2;
	
	if(num3 > 10){
	message = "Welcome to Exception Handling ";
	}
	
	System.out.println("Message is :"+message.toUpperCase());
	}
	catch(InputMismatchException ime) {
		System.out.println("Please enter valid number");
		System.out.println(ime.toString());
	}
	catch(ArithmeticException AE) {
		System.out.println("num2 should not be 0");
		System.out.println(AE.toString());
	}
	catch(NullPointerException Npe) {
		System.out.println("String value is null");
		System.out.println(Npe.toString());
	}
	System.out.println("end of main");
}
}