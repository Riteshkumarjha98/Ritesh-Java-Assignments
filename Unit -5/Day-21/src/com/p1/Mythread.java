package com.p1;

public class Mythread implements Runnable {

	int prod=1;
	@Override
	public void run() {
		for(int i=1; i<=10;i++) {
			prod =prod*i;
		}
		
	}
	

}
