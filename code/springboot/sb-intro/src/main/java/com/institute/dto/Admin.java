package com.institute.dto;

import org.springframework.stereotype.Component;

@Component
public class Admin {
	public Admin() {
		System.out.println("Admin Object Created..");
	}
	
	public void print() {
		System.out.println("Hello, I am a Admin");
	}
}
