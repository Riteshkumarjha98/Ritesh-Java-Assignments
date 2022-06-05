package com.p1;


public interface Y {
  
void dance();
	
    default void singing() {
    	System.out.println("I am Singing  in Yintr");
    }
    
    public static void rideing() {
    	System.out.println("I am rideing in Yintr");
    }
}