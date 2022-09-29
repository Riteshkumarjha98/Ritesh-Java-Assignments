package com.assignment;

public class Init_Setup {

	private String message;
	
	public void mySetup() {
		System.out.println("Inside InitMethod..Object Initilized.."); 
		System.out.println( message);
	 }
	
	public Init_Setup() {
		
	}
   
	public void setMessage(String message) {
		this.message = message;
	}
	
}
