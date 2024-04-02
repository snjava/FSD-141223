package com.institute.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	// http://localhost:9090/welcome-msg
	@GetMapping("/welcome-msg")
	public String returnWelcomeMsg() {
		return "WELCOME TO FIRST REST API....";
	}
	
	// http://localhost:9090/hello-msg
	@GetMapping("/hello-msg")
	public String returnHelloMessage() {
		return "Hello User, Welcome To the REST API Introduction Application";
	}
	
}
