package com.assignment;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.assignment")
@PropertySource("a1.properties")
public class AppConfig {

	@Bean("StudentList")
	public List<Student> getStudentList() {  
		
		List<Student> students = new ArrayList<>();
		
		students.add(new Student(1, "Anny", 700));
		students.add(new Student(2, "Ratan", 600));
		students.add(new Student(3, "Rashekar", 800));
		students.add(new Student(3, "Arman",500));
		students.add(new Student(3, "Rich",1000));
		 
		
		return students;
		
		}
}
