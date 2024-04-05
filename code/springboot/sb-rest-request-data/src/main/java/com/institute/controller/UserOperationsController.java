package com.institute.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.institute.service.UserOperationService;

@RestController
public class UserOperationsController {

	@Autowired
	UserOperationService operationService;
	
	// http://localhost:8080/get-data-by-param?fname=Abc&mname=Pqr&lname=Xyz&byear=2002
	@GetMapping("/get-data-by-param")
	public String getUserDataByRequestParam(@RequestParam("fname") String fname, @RequestParam("lname") String lname, 
			@RequestParam("mname") String mname, @RequestParam("byear") int year) {

		String fullname = fname + " " + mname + " " + lname;
		int age = operationService.calculateAge(year);
		
		String nameResponse = "<h1>Hello user, "+ fullname + "</h1>";
		String ageResponse = "<h1> Your Age : "+ age +"</h1>";
		
		return nameResponse + ageResponse;
	}
	
	// http://localhost:8080/get-data/Abc/Pqr/Xyz/2002/by-path-varaible
	@GetMapping("/get-data/{fn}/{mn}/{ln}/{yr}/by-path-varaible")
	public String getUserDataByPathVariable(@PathVariable(value="fn") String fname, 
			@PathVariable(value="mn") String mname, 
			@PathVariable(value="ln") String lname, 
			@PathVariable(value="yr") int year) {
		String fullname = fname + " " + mname + " " + lname;
		int age = operationService.calculateAge(year);
		
		String nameResponse = "<h1>Hi user, "+ fullname + "</h1>";
		String ageResponse = "<h1> Your Age : "+ age +"</h1>";
		
		return nameResponse + ageResponse;
	}
	
}
