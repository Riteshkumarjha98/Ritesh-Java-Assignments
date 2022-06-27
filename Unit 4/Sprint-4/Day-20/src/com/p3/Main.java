package com.p3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student(12, "n1",890));
		studentList.add(new Student(17, "n2",590));
		studentList.add(new Student(112, "n3",290));
		studentList.add(new Student(126, "n4",190));
		studentList.add(new Student(13, "n5",490));
		
//		System.out.println(studentList);
		
		
		List<Employee> employeeList =  studentList.stream()
		   .map((s) ->{
			   Employee e = new Employee();
			   e.setEmpId(s.getRoll());
			   e.setSalary(s.getMarks() * 1000);
			   e.setName(s.getName());
			   return e;
		   })
		   .collect(Collectors.toList());
		   
		   System.out.println(employeeList);

	}

}
