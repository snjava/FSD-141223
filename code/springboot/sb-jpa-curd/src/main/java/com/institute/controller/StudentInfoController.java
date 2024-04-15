package com.institute.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.institute.entity.StudentInfo;
import com.institute.repository.StudentInfoRepository;

@RestController
public class StudentInfoController {
	
	@Autowired
	StudentInfoRepository infoRepository;

	// http://localhost:8080/save-student-info
	/*
	  {
	  	"sid":12,
	  	"name": "Test1",
	  	"contact": "1111122222",
	  	"city": "Pune"
	  }
	 */
	@PostMapping("/save-student-info")
	public String saveStudent(@RequestBody StudentInfo info) {
		infoRepository.save(info);
		return "Student Details save Successfully...";
	}
}
