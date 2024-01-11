
public class ConstructorDemo {
	public static void main(String[] args) {
		Student st1 = new Student();
		st1.print();
		System.out.println("=====================");
		Student st2 = new Student(123, "Abc", "8899776655", 22);
		st2.print();
		System.out.println("=====================");
		Student st3 = new Student(321, "Xyz", "8888899999");
		st3.print();
	}
}

class Student {
	private int id;
	private String name;
	private String contact;
	private int age; 
	
	// No-Param Constructor
	public Student() {
		name = "NA";
		contact = "NA";
	}
	
	// 4-Param Constructor
	public Student(int i, String n, String c, int a) {
		id = i;
		name = n; 
		contact = c;
		age = a;
	}
	
	// 3-Param Constructor
	public Student(int i, String n, String c) {
		id = i;
		name = n;
		contact = c;
	}
	
	public void print() {
		System.out.println("Id : " + id);	// 0
		System.out.println("Name : " + name); // NA
		System.out.println("Contact : " + contact); // NA
		System.out.println("Age : " + age); // 0
	}
	
}
