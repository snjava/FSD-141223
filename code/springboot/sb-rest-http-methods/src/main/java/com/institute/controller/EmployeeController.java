package com.institute.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.institute.dto.Employee;
import com.institute.service.EmployeeService;

@CrossOrigin("*")
@RestController
public class EmployeeController {

	@Autowired
	EmployeeService service;
	
	@PostMapping("/save-employee")
	public String saveEmployee(@RequestBody Employee emp) {
		boolean result = service.addEmployee(emp);
		if(result) {
			return "Employee Save Successfully";
		} else {
			return "Unable to save Employee Details";
		}
	}
	
	@GetMapping("/get-all-employees")
	public ArrayList<Employee> getEmployees() {
		return service.getAllEmp();
	}
	
	
	@DeleteMapping("/delete-emp")
	public String deleteEmployeeById(@RequestParam("eid") int id) {
		boolean result = service.deleteEmployeeById(id);
		if(result) {
			return "Employee Deleted Successfully";
		} else {
			return "Unable to Delete Employee.";
		}
	}
	
	@GetMapping("/get-emp-by-id/{id}")
	public Employee getEmpById(@PathVariable(value = "id") int eid) {
		return service.getEmpById(eid);
	}
	
	@PutMapping("/update-employee")
	public String updateEmployeeDetails(@RequestParam("eid") int id,
			@RequestParam("email") String email) {
		service.updateEmployee(id, email);
		return "EMployee Updated Successfully..";
		
	}
	
}






















