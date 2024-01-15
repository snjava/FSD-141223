public class ThisKeyword2 {
	public static void main(String[] args) {
		Employee e1 = new Employee(111, "Abc", "M", 345324.34);
		e1.printDetails();
		System.out.println("==================");
		Employee e2 = new Employee(222, "Xyz", "F");
		e2.printDetails();
	}
}
class Employee {
	int id;
	String name;
	String gender;
	double salary;
	public Employee(int id, String name, String gender, double salary) {
		this(id, name, gender); // access constructor of same class using this keyword
		this.salary = salary;
	}
	public Employee(int id, String name, String gender) {
		this.id = id;
		this.name = name;
		this.gender = gender;
	}
	public void printDetails() {
		System.out.println("Id : " + id);
		System.out.println("Name : " + name);
		System.out.println("Gender : " + gender);
		System.out.println("Salary : " + salary);
	}
}
