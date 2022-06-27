package com.p1;

public class Main {
	public static void main (String[]args) {
	
		Mythread mt = new Mythread(); 
		Thread t1 = new Thread(mt);
		
		t1.start();
        try {
			t1.join();
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
		
		 int result = mt.prod;
		 
		 System.out.println("Inside main thread");
		 
		System.out.println("Product is :" + result);


		}
}
