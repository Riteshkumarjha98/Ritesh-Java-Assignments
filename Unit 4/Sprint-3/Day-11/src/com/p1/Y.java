package com.p1;

public interface Y {
	
         void abstractMethodY();
	
	
	default void defaultMethodY() {
		System.out.println("I'm Default Method of Y");
	}
	
	static void staticMethodY() {
		System.out.println("I'm static Method of Y");
	}
}
