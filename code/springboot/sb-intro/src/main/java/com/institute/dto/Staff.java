package com.institute.dto;

import org.springframework.stereotype.Component;

@Component
public class Staff {
	public Staff() {
		System.out.println("Staff Object Created..");
	}
	
	public void print() {
		System.out.println("Hello, I am a Staff");
	}
}
