package com.institute.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
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
		infoRepository.save(info); // use to insert or update the record
		return "Student Details save Successfully...";
	}
	
	// http://localhost:8080/update-student-info
	@PutMapping("/update-student-info")
	public String updateStudent(@RequestBody StudentInfo info) {
		infoRepository.save(info); // use to insert or update the record
		return "Student Details Updated Successfully...";
	}
	
	// http://localhost:8080/delete-student-by-id?sid=12
	@DeleteMapping("/delete-student-by-id")
	public String deleteStudent(@RequestParam("sid") int id) {
		infoRepository.deleteById(id);
		return "Student Details Deleted Successfully...";
	}
	
	// http://localhost:8080/get-student-by-id/12
	@GetMapping("/get-student-by-id/{id}")
	public StudentInfo getStudentById(@PathVariable(value = "id") int id) {
		return infoRepository.findById(id).get();
	}
	
	@GetMapping("/get-students")
	public List<StudentInfo> getAllStudent() {
		return infoRepository.findAll();
	}
	
}










