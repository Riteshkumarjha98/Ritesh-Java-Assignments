package com.masai;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages = "com.masai")
public class AppConfig {


	@Bean("sl")
	public ServiceLayer getSL() {
		ServiceLayer sl = new ServiceLayer();
		sl.setA(10);
		sl.setB(5);
		sl.setR(7);
		
		return sl;
	}


	@Bean("cid") // If we want to change id name then write manually
	public Calculator getEvaluate() {

		return new Rectangle();
		

	}
}
