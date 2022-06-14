package com.p2;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;



public class Main {

	public static void main (String[]args) {
		
		TreeSet<Employee> ts = new TreeSet<>(new EmpSalcomp());
		
		Scanner in = new Scanner (System.in);
		
		for(int i=1;i<=2;i++) {
			System.out.println("Enter Emplyoee Id");
			int id =in.nextInt();
			in.nextLine();
			
			System.out.println("Enter Emplyoee Name");
			String name = in.nextLine();
			
			System.out.println("Enter Employee Salary");
		  double sal	= in.nextDouble();
		  
		  
		  Employee e = new Employee(id, name, sal);
		  ts.add(e);
		}
		
		System.out.println(ts);
		
		for(Employee s:ts) {
			System.out.println(s);
		}
	}
}
