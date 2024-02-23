import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.ListIterator;

/*
 * Wanted to create a list of student which can be frequently modifies, the student has to store
 * in same order in which it is inserted. Every student must be unique by ID
 */

public class CutomeGenericType {
	public static void main(String[] args) {
		Student s1 = new Student(123, "Abc", "988998899");
		Student s2 = new Student(12, "Xyz", "666998899");
		Student s3 = new Student(23, "Lmn", "891998899");
		Student s4 = new Student(13, "Pqr", "771998899");
		Student s5 = new Student(11, "Stu", "671998899");
		LinkedList<Student> studentList = new LinkedList<Student>();
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		studentList.add(s4);
		studentList.add(s5);
		System.out.println(studentList);
		
		// get Object by Enhance For Loop
		for(Student obj : studentList) {
			System.out.println("Id : " + obj.id);
			System.out.println("Name : " + obj.name);
			System.out.println("Contact : " + obj.contact);
			System.out.println("----------------------------------");
		}
		
		// Get Object by Iterator
		/*Iterator<Student> it = studentList.iterator();
		while(it.hasNext()) {
			Student obj = it.next();
			System.out.println("Id : " + obj.id);
			System.out.println("Name : " + obj.name);
			System.out.println("Contact : " + obj.contact);
			System.out.println("----------------------------------");
		}*/
		
		// Get Object by ListIterator
		/*ListIterator<Student> it = studentList.listIterator();
		while(it.hasNext()) {
			Student obj = it.next();
			System.out.println("Id : " + obj.id);
			System.out.println("Name : " + obj.name);
			System.out.println("Contact : " + obj.contact);
			System.out.println("----------------------------------");
		}
		System.out.println("------Reverse Direction---------");
		while(it.hasPrevious()) {
			Student obj = it.previous();
			System.out.println("Id : " + obj.id);
			System.out.println("Name : " + obj.name);
			System.out.println("Contact : " + obj.contact);
			System.out.println("----------------------------------");
		}*/
	}
}

class Student {
	int id;
	String name;
	String contact;
	public Student(int id, String name, String contact) {
		this.id = id;
		this.name = name;
		this.contact = contact;
	}
}


