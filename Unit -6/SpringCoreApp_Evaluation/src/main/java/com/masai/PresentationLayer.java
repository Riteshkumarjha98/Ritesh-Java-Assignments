package com.masai;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service(value="pr")
public class PresentationLayer {
	
	@Autowired
	@Qualifier("sl")
	ServiceLayer service = new ServiceLayer();
	
	public void eval() {
		service.doEvaluation();
	}
}

