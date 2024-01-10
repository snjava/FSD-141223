public class InheritanceDemo {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.id = 112;
		e1.salary = 234234.23;
		e1.name = "Abc";
		e1.gender = "F";
		
		e1.printPersonDetails();
		e1.printEmployeeDetails();
		
		System.out.println("=========================");
		SoftwareDeveloper dev = new SoftwareDeveloper();
		dev.id = 321;
		dev.name = "Xyz";
		dev.salary = 345345.43;
		dev.gender = "M";
		dev.laguage = "Java, HTML, CSS";
		dev.printDeveloperDetails();
		
	}
}

class Person {
	String name;
	String gender;
	public void printPersonDetails() {
		System.out.println("Name : " + name);
		System.out.println("Gender : " + gender);
	}
}
// Employee IS-A Person
class Employee extends Person {
	int id;
	double salary;
	public void printEmployeeDetails() {
		System.out.println("Id : " + id);
		System.out.println("Salary : " + salary);
	}
}
class SoftwareDeveloper extends Employee {
	String laguage;
	public void printDeveloperDetails() {
		printPersonDetails();
		printEmployeeDetails();
		System.out.println("Language : " + laguage);
	}
}
class Doctor extends Employee {
	String specilization;
	public void printDoctorDetails() {
		printPersonDetails();
		printEmployeeDetails();
		System.out.println("Specilization" + specilization);
	}
}



