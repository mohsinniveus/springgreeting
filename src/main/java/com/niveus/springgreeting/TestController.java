package com.niveus.springgreeting;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/greeting")
public class TestController {

	@GetMapping("/hello")
	public String sayHello(@RequestParam String user) {
		return " Hello - "+user+", Greating from Kubernetes Community. How are you feeling today, Have a great day";
	}
	
	@RequestMapping("/exception/arithmetic")
    public String controllerForArithmeticException(){
		
          throw new ArithmeticException("Divide by zero error");
    }


}
