package com.assignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service(value="Pre")
public class Presentation {
	
	@Autowired
	@Qualifier("serv")
	ServiceLayer service = new ServiceLayer();
	
	public void eval() {
		service.doEvaluation();
	}
}

