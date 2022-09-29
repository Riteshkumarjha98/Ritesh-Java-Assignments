package com.masai;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	     AbstractApplicationContext context = new AnnotationConfigApplicationContext
	             (AppConfig.class);
	         ClassA objA = (ClassA)context.getBean("classA");
	         objA.displayMessage();
	         context.close();
	     }
	}


