package br.usjt.hellospringboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloSpringBootController {

	@GetMapping ("/hello")
	public String hello() {
	return "hello_spring_boot";
	}
	
}
