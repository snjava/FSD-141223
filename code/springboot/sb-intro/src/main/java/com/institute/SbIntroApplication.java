package com.institute;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.institute.dto.Company;
import com.institute.dto.Staff;
import com.institute.dto.Student;
import com.institute.dto.Teacher;

@SpringBootApplication
public class SbIntroApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SbIntroApplication.class, args);
		
		/*Student stud = new Student();
		stud.print();
		Teacher teach = new  Teacher();
		teach.print();*/
		
		Student stud = ctx.getBean(Student.class);
		stud.print();
		Staff staff = ctx.getBean(Staff.class);
		staff.print();
		Company c = ctx.getBean(Company.class);
		c.printCompanyDetails();
	}

	@Bean
	public Company getCompanyObject() {
		Company com = new Company("Abc pvt.ltd", "Pune");
		return com;
	}
	
}
