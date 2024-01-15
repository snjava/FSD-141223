public class SuperKeyword2 {
	public static void main(String[] args) {
		Cls2 obj = new Cls2(111);
	}
}

class Cls1 {
	public Cls1() {
		super();
		System.out.println("Cls1 No param Constructor");
	}
	public Cls1(int a) {
		super();
		System.out.println("Cls1 1 param Constructor");
	}
}
class Cls2 extends Cls1 {
	public Cls2() {
		super();
		System.out.println("Cls2 No param Constructor");
	}
	public Cls2(int a) {
		super(222);
		System.out.println("Cls2 1 param Constructor");
	}
}
