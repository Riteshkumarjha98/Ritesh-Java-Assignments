package com.p2;
import java.util.Scanner;

     public class Main {
	
   public static void main(String[] args) {
	   
	EmployeeBonus Eb = new EmployeeBonus();
	Scanner in = new Scanner(System.in);
	
	System.out.println("Enter Employee joining date in formate dd-MM-yyyy");
     String joinDate =	in.next();
	
	try {
		
		
		double bonus = Eb.bonus(joinDate);
		System.out.println("Bonus of the employee is : " + bonus);
	} catch (InvalidAgeException iae) {
		
		System.out.println(iae.getMessage());
	}
	
	
	System.out.println("------------------------");
}

}
