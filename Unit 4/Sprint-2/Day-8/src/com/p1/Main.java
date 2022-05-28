package com.p1;

public class Main {

	public static void main(String[] args) {
		Bird B1 = new Parrot();
		B1.fly();
		Parrot P1 = (Parrot)B1;
		P1.sing();
	}
}