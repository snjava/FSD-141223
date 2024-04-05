package com.institute.service;

import java.time.LocalDate;

import org.springframework.stereotype.Service;

@Service
public class UserOperationService {

	public int calculateAge(int birthYear) {
		int currentYear = LocalDate.now().getYear();
		int age = currentYear - birthYear;
		return age;
	}
}
