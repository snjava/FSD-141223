package com.institute.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.institute.entity.UserDetails;
import com.institute.repository.UserDetailsRepository;

@RestController
public class UserDetailsController {
	
	@Autowired
	private UserDetailsRepository detailsRepository;
	
	@PostMapping("/save-user-details")
	public String saveUserDetails(@RequestBody UserDetails details) {
		detailsRepository.save(details);
		return "User Data Save Successfully..";
	}
	
	@GetMapping("/get-user-by-id")
	public UserDetails getUserDetailsById(@RequestParam int id) {
		return detailsRepository.findById(id).get();
	}
	
}
