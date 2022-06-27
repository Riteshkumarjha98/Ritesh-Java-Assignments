package com.p2;

public class RaceConditionDemo{
	  public static void main(String[] args) {
	    Counter count = new Counter();
	    
	    Thread t1 = new Thread(count, "Thread-1");
	    Thread t2 = new Thread(count, "Thread-2");
	    Thread t3 = new Thread(count, "Thread-3");
	    
	    t1.start();
	    t2.start();
	    t3.start();
	  }    
	}
