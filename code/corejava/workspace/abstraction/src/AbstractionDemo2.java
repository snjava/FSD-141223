public class AbstractionDemo2 {
	public static void main(String[] args) {
		Employee emp = new Developer();
		emp.companyName();
		emp.dept();
		emp.task();
	}
}

abstract class Test {
	public void m1() {
		
	}
	public void m2() {
		
	}
	public void m3() {
		
	}
}

abstract class Employee {
	public Employee() {
		System.out.println("Employee Constructor...");
	}
	public abstract void companyName();
	public abstract void dept();
	public abstract void task();
	public static final void demo() {
		System.out.println("Static final method from abstract");
	}
}

class Developer extends Employee {
	public void companyName() {
		System.out.println("Company : ABC pvt.ltd");
	}
	public void dept() {
		System.out.println("Department : Software Development");
	}
	public void task() {
		System.out.println("Task : Development of Application");
	}
}