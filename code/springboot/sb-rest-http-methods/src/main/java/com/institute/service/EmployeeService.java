package com.institute.service;

import java.util.ArrayList;
import org.springframework.stereotype.Service;
import com.institute.dto.Employee;

@Service
public class EmployeeService {
	
	private ArrayList<Employee> empList = new ArrayList<Employee>();
	
	public boolean addEmployee(Employee emp) {
		return empList.add(emp);
	}
	
	public ArrayList<Employee> getAllEmp() {
		return empList;
	}
	
	public boolean deleteEmployeeById(int eid) {
		Employee employee = getEmpById(eid);
		return empList.remove(employee);
	}

	public Employee getEmpById(int id) {
		Employee employee = null;
		for(Employee e : empList) {
			if(e.getEid() == id) {
				employee = e;
				break;
			}
		}
		return employee;
	}
	
	
	
	public boolean updateEmployee(int id, String email) {
		Employee emp = getEmpById(id);
		emp.setEmail(email);
		return true;
	}
	
}






