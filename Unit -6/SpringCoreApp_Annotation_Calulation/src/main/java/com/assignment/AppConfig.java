package com.assignment;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages = "com.assignment")
public class AppConfig {

    @Bean("serv")
	public ServiceLayer getSL() {
		ServiceLayer sl = new ServiceLayer();
		sl.setA(20);
		sl.setB(5);
		
		return sl;
	}


	@Bean("cal") 
	public Calculator getEvaluate() {

		return new Divide();
		

	}
}