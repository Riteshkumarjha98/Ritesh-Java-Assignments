package com.p2;

public abstract class Student {

	String name;
	String address;
	
	public abstract double getPercentage();
	
	
	
	public Student (String name, String address) {
		this.name=name;
		this.address= address;
	}
}
