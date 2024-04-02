package com.institute;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import com.institute.bean.Admin;
import com.institute.bean.Student;

@SpringBootApplication
public class SbDiAutowireApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SbDiAutowireApplication.class, args);
		/*Student st = ctx.getBean(Student.class);
		//Student st = ctx.getBean("stud2", Student.class);
		System.out.println("Id : " + st.getId());
		System.out.println("Name : " + st.getName());
		System.out.println("Contact : " + st.getContact());*/
		
		Admin admin = ctx.getBean(Admin.class);
		admin.printStudentDetails();
	}
	
	/*
	 * Setter Injection (SI)
	 */
	@Bean("stud1")
	public Student getStudent1() { 
		Student st = new Student();
		st.setId(123); 
		st.setName("Abcd");
		st.setContact("9898909098");
		return st;
	}
	
	/*
	 * Constructor Injection (CI)
	 */
	@Bean("stud2")
	@Primary
	public Student getStudent2() {
		Student st = new Student(321, "Xyz", "9999988888");
		return st;
	}

}
