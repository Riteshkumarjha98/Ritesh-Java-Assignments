package com.p1;


public interface X {
  
	void walking();
	
    default void flying() {
    	System.out.println("I am flying  in Xintr");
    }
    
    public static void running() {
    	System.out.println("I am running in Xintr");
    }
}  