package com.institute.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.institute.entity.UserAddress;
import com.institute.repository.UserAddressRepository;

@RestController
public class UserAddressController {

	@Autowired
	UserAddressRepository addressRepository;
	
	@PostMapping("/save-user-address")
	public String saveUserDetails(@RequestBody UserAddress address) {
		addressRepository.save(address);
		return "User Address Save Successfully..";
	}
	
}
