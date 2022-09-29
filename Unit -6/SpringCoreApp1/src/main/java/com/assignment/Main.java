package com.assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
 ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
   
		Drawshapes D_shape = ctx.getBean(Drawshapes.class,"drawShape");
		D_shape.drawShape();
	}

}
