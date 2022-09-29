package com.masai;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
@GetMapping("/hi")
public String sayHello() {
	
return "welcome"; // it will be represented as raw data.
}
}
