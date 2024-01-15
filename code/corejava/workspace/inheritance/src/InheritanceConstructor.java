
public class InheritanceConstructor {
	public static void main(String[] args) {
		C3 c3 = new C3(20);
	}
}
// By default every constructor of the child class 
// calls parent class no/param or default constructor
class C1 {
	public C1() {
		super();
		System.out.println("C1 No Pram Constructor");
	}
	public C1(int a) {
		System.out.println("C1 1 Pram Constructor");
	}
}

class C2 extends C1 {
	public C2() {
		super();
		System.out.println("C2 No Pram Constructor");
	}
	public C2(int a) {
		System.out.println("C2 1 Pram Constructor");
	}
}

class C3 extends C2 {
	public C3() {
		super();
		System.out.println("C3 No Pram Constructor");
	}
	public C3(int a) {
		super();
		System.out.println("C3 1 Pram Constructor");
	}
}
