package com.assignment;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {

	public static void main(String[] args) {
		
		 ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		   Presentation sl = ac.getBean("Pre",Presentation.class);
		   sl.eval();
		   
		
		
		
	}

}
