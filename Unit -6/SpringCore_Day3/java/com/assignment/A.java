package com.assignment;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service(value ="aObj")
//@PropertySource("a1.properties")

public class A {
	
	
	@Value("${cities}")
	List<String> cities;
	
	
	@Value("#{${props}}")
	Map<String, String> map;
	
	
	
	@Autowired
	@Qualifier("StudentList")
	List<Student> students;
	

 public void funA() {
		
	    System.out.println(cities);
  
	 for(Student x: students) {
		   System.out.println(x.name);
		   System.out.println(x.roll);
		   System.out.println(x.marks);
	   }
	   
	   System.out.println(map);
		
		}
   
}
