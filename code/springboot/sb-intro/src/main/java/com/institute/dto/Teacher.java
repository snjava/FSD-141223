package com.institute.dto;

import org.springframework.stereotype.Component;

@Component
public class Teacher {
	public Teacher() {
		System.out.println("Teacher Object Created..");
	}
	public void print() {
		System.out.println("Hello, I am a Teacher");
	}
}
