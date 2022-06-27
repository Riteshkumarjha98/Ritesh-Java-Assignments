package com.p3;

public class Common {
	  public  void fun1(String name) {
		  
		  synchronized (Common.class) {
			 
			 System.out.println("Inside fun1 of Common Class Synchronized block");
			
			 System.out.println("Your Name Is :" + name);
		}
	  }

}
