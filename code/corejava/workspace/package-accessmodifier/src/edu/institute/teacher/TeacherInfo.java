package edu.institute.teacher;
//import edu.institute.student.StudentInfo;
//import edu.institute.student.StudentAttendance;
import edu.institute.student.*;
import java.util.Scanner;
import java.lang.*;
public class TeacherInfo extends StudentInfo {

	public void accessStudentInfoByObject() {
		StudentInfo info = new StudentInfo();
		//System.out.println("Id : " + info.id);
		System.out.println("Name : " + info.name);
		//System.out.println("Email : " + info.email);
		//System.out.println("Contact : " + info.contact);
	}
	
	public void accessStudentInfoByInheritance() {
		//System.out.println("Id : " + id);
		System.out.println("Name : " + name);
		System.out.println("Email : " + email);
		//System.out.println("Contact : " + contact);
	}
}