import java.util.LinkedHashSet;

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
		LinkedHashSet<Student> studentList = new LinkedHashSet<Student>();
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		studentList.add(s4);
		studentList.add(s5);
		System.out.println(studentList);
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


