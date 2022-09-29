package com.assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {

	public static void main (String[] args) {
		  ApplicationContext CTX = new AnnotationConfigApplicationContext(AppConfig.class);
	      A  aObj = CTX.getBean("aObj",A.class);
		   
		   aObj.funA();
}
}