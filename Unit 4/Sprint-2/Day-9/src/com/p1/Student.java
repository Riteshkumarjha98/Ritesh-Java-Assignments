package com.p1;
import java.util.Scanner;

public class Student {
	private int roll;
	private String name;
	private int marks;
	private char grade;
	
	
	public Student() {
		
	}
	
	
	
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + ", grade=" + grade + "]";
	}



	public Student(int roll, String name, int marks, char grade) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
		this.grade = grade;
	}

	public void displayDetail() {
		Scanner in = new Scanner (System.in);
		System.out.println("Enter the roll no of the Student: ");
		int roll= in.nextInt();
		
		System.out.println("Enter the name of the Student : ");
		String name=in.nextLine();
		
		System.out.print("Enter the marks of the Student : ");
		int marks=in.nextInt();
		char grade = calculatorChar();
		
		
		setRoll(roll);
		setName(name);
		setMarks(marks);
		setGrade(grade);
	
		
		
	}
	





	private void setGrade(char grade2) {
		// TODO Auto-generated method stub
		
	}



	private void setMarks(int marks2) {
		// TODO Auto-generated method stub
		
	}



	private void setName(String name2) {
		// TODO Auto-generated method stub
		
	}



	private void setRoll(int roll2) {
		// TODO Auto-generated method stub
		
	}
	private int getmarks() {
		// TODO Auto-generated method stub
		return 0;
	}



	public char calculatorChar() {
		char grade;
		int marks = getmarks();
		if (marks>=500) {
			grade='A';
			
			}else if(marks>=400) {
				grade='B';
				
			}
			else {
				grade= 'C';
			}
		return grade;
	}



	


	
	
}









