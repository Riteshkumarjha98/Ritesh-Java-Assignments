package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		   ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		   PresentationLayer sl = ac.getBean("pr",PresentationLayer.class);
		   sl.eval();
	}

}
