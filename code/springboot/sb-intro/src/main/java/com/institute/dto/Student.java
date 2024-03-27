package com.institute.dto;

import org.springframework.stereotype.Component;

@Component
public class Student {
	public Student() {
		System.out.println("Student Object Created..");
	}
	
	public void print() {
		System.out.println("Hello, I am a Student");
	}
}
