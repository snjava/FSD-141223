package com.institute.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.institute.dto.StudentDto;
import com.institute.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService service;
	
	// http://localhost:8080/get-message
	@GetMapping("/get-message")
	public String returnMessage() {
		return service.getMessage();
	}
	
	@GetMapping("/get-messages")
	public ArrayList<String> returnMessages() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Abc");
		list.add("Xyz");
		list.add("Lmn");
		list.add("Pqr");
		list.add("Stu");
		return list;
	}
	
	@GetMapping("/get-student")
	public StudentDto getStudent() {
		StudentDto stud = new StudentDto();
		stud.setId(123);
		stud.setName("Abcd");
		stud.setEmail("abcd@gmail.com");
		return stud;
		
	}
	
	@GetMapping("/get-students")
	public ArrayList<StudentDto> getStudents() {
		ArrayList<StudentDto> list = new ArrayList<StudentDto>();
		StudentDto stud1 = new StudentDto();
		stud1.setId(123);
		stud1.setName("Abcd");
		stud1.setEmail("abcd@gmail.com");
		
		StudentDto stud2 = new StudentDto();
		stud2.setId(321);
		stud2.setName("Xyz");
		stud2.setEmail("xyz@gmail.com");
		
		list.add(stud1);
		list.add(stud2);
		return list;
		
	}
}
