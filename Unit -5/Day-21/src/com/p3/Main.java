package com.p3;

public class Main {
	 public static void main(String[] args) {
			Common c = new Common();
			
			ThreadA tA = new ThreadA(c, "Ritesh");
			ThreadB tB = new ThreadB(c, "Vikash");
//			ThreadA tA2 = new ThreadA(c,"Ritesh");
			
			Thread t1 = new Thread(tA);
			Thread t2 = new Thread(tB);

			t1.start();
			
			t2.start();
			
			
			


			
			
			
			
		 }

}
