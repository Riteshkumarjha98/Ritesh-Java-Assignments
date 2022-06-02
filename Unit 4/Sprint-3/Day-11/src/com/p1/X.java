package com.p1;

public interface X {

	void abstractMethodX();
	
	
	default void defaultMethodX() {
		System.out.println("I'm inside Default Method X");
	}
	
	
	public static void staticMethodX() {
	System.out.println("I'm static Method of X");
		
	}


	void MethodZ();
}
