package com.p2;

import java.util.Scanner;


public final class child extends Parent {
	
   @Override
	public void method1() {
		System.out.println(getNumber());
		System.out.println("I'm inside child class of method 1");
	}
	
	
	public void method4() {
		System.out.println("I'm inside method 4 of child");
	}
	
	public child(int i) {
	  super(i);
	}


	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number between 1 to 10 : ");
		int userInput = input.nextInt();
		if(userInput >= 1 && userInput <= 10) {
			Parent var = new child(userInput);
			var.method1();
			var.method2();
			var.method3();
		}
		else {
			System.out.println("Invalid number");
		}
	
	
	}
}