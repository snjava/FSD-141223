
public class InnerClassTest {
	public static void main(String[] args) {
		A.B obj = new A.B();
		obj.print();
	}
}

class A {
	
	static class B {
		public void print() {
			System.out.println("Class B");
		}
	}
	
}