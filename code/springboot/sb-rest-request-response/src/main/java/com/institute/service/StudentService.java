package com.institute.service;

import java.time.LocalTime;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
	
	// 6-11 - Good Morning
	// 12-16 - Good After noon
	// 17-20 - Good Evening
	// 20-24 - Good Night
	public String getMessage() {
		int currentHour = LocalTime.now().getHour();
		System.out.println("CUrrent Hour is : " + currentHour);
		String message = "";
		if(currentHour >=6 && currentHour<=11) {
			message = "Good Morning";
		} else if(currentHour >=12 && currentHour<=16) {
			message = "Good After noon";
		} else if(currentHour >=17 && currentHour<=20) {
			message = "Good Evening";
		} else if(currentHour >=20 && currentHour<=24) {
			message = "Good Night";
		}
		return message;
	}
}
