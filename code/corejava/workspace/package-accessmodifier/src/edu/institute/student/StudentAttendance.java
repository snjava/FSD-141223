package edu.institute.student;

public class StudentAttendance extends StudentInfo {

	public void printStudInfoByObj() {
		StudentInfo info = new StudentInfo();
		//System.out.println("Id : " + info.id);
		System.out.println("Name : " + info.name);
		System.out.println("Email : " + info.email);
		System.out.println("Contact : " + info.contact);
	}
	
	public void printStudInfoByInheritance() {
		//System.out.println("Id : " + id);
		System.out.println("Name : " + name);
		System.out.println("Email : " + email);
		System.out.println("Contact : " + contact);
	}
	
}
