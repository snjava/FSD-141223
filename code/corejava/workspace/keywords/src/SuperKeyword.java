public class SuperKeyword {
	public static void main(String[] args) {
		Child ch = new Child();
		ch.test();
	}
}

class Parent {
	int a = 10;
	public void print() {
		System.out.println("print() from Parent class.");
	}
}

class Child extends Parent {
	int a =20;
	public void print() {
		System.out.println("print() from Child class.");
	}
	
	public void test() {
		System.out.println(super.a); // access Super class variable
		System.out.println(a);
		super.print(); // access Super class method
	}
}
class Demo extends Child {
	int a = 30;
	public void test() {
		System.out.println(super.a); // Access the property from Child class
	}
}
