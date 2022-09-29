package com.assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {

	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		ServiceLayer sl  = ac.getBean(ServiceLayer.class,"serviceLayer");
	    sl.doEvaluation();
	    
  
	//   Init_Setup initObj = ac.getBean("init", Init_Setup.class);
	    
	//   Destroy destroyObj = ac.getBean("destroy", Destroy.class);
		
	   ((ClassPathXmlApplicationContext)ac).close(); 

	}

}
