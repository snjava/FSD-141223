package com.institute.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Admin {
	
	@Autowired
	@Qualifier("stud1")
	Student st; // Dependency Injection (DI)
	
	public void printStudentDetails() {
		System.out.println("Id : " + st.getId());
		System.out.println("Name : " + st.getName());
		System.out.println("Contact : " + st.getContact());
	}

}
