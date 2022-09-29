package com.assignment;

public class Init {

	private String message;
	
	public void mySetup() {
		System.out.println("Initilized with mySetup method in A"); 
		System.out.println( message);
	 }
	
	
	public Init() {
		
	}


	public void setMessage(String message) {
		this.message = message;
	}
	
}
