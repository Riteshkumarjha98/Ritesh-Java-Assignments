package com.p1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main{
	
	
	public static void main(String[] args) {
		
		List<Student> studentList = new ArrayList<>();
		
		studentList.add(new Student(1, "n4", 790));
		studentList.add(new Student(2, "n10", 380));
		studentList.add(new Student(3, "n11", 480));
		studentList.add(new Student(4, "n12", 280));
		studentList.add(new Student(5, "n5", 970));
	

	
	List<Student> studentFilter =	studentList.stream()
		.filter(s ->s.getMarks() < 800)
		.collect(Collectors.toList());
		
		
		System.out.println(studentFilter);
		
	}
}
		
		
		
	

