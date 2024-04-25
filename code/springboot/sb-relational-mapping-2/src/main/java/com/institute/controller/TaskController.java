package com.institute.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.institute.entity.Task;
import com.institute.repository.TaskRepository;

@RestController
public class TaskController {

	@Autowired
	private TaskRepository repository;
	
	@PostMapping("/save-task")
	public String saveEmp(@RequestBody Task task) {
		repository.save(task);
		return "Task Save Successfully..";
	}
	
}
