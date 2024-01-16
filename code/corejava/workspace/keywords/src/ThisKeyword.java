public class ThisKeyword {
	public static void main(String[] args) {
		ThisDemo demo = new ThisDemo();
		demo.print();
	}
}

class ThisDemo {
	int a = 10;
	public void print() {
		int a = 30;
		System.out.println(a); // 30
		System.out.println(this.a); // 10 // accessing same class variable using this keyword
		this.demo(1234);	// accessing same class method using this keyword
	}
	public void demo(int a) {
		System.out.println("This is demo function..");
		System.out.println("a = " + a); // 1234
		System.out.println("a = " + this.a); // 10
	}
}
