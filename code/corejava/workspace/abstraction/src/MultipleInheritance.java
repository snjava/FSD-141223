public class MultipleInheritance {
	public static void main(String[] args) {
	
	}
}

interface I1 {
	public void m1();
}

interface I2 {
	public void m1();
}

class MultiInherit implements I1, I2 {
	public void m1() {
		
	}
}

// One interface can extends more than one interface. 
interface I3 extends I1, I2 {
	public void m3();
}
// one class can implements more than one interface
class Demo1 implements I1, I2 {
	public void m1() {
		
	}
	public void m2() {
		
	}
}
// one class can extends another class and implements more than one interface
class Test2 extends Demo1 implements I3 {
	public void m3() {
		
	}
}


