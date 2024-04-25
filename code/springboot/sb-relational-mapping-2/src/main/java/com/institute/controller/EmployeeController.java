package com.institute.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.institute.entity.Employee;
import com.institute.repository.EmployeeRepository;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeRepository repository;
	
	@PostMapping("/save-employee")
	public String saveEmp(@RequestBody Employee employee) {
		repository.save(employee);
		return "Employee Save Successfully..";
	}
	
	@GetMapping("/get-emp-id/{id}")
	public Employee getEmpById(@PathVariable("id") int id) {
		return repository.findById(id).get();
	}
	
}






