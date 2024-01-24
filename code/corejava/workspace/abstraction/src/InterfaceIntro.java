
public class InterfaceIntro {
	public static void main(String[] args) {
		Inter inter = new Child();
		inter.m1();
	}
}

interface Inter {
	int a = 20;		// public static final int a = 20;
	void m1();		// public abstract void m1();
}

class Child implements Inter {
	public void m1() {
		System.out.println("m1 from child class");
	}
}

abstract class Test1 implements Inter {
	
}