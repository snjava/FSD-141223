package com.institute.bean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName = "prototype")
public class Admin {
	public Admin() {
		System.out.println("Admin Object Created...");
	}
}
