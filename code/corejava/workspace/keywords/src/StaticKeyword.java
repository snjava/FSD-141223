public class StaticKeyword {
	public static void main(String[] args) {
		System.out.println(StaticDemo.PI);
		StaticDemo.print();
		
		System.out.println("=================");
		
		StaticDemo d1 = new StaticDemo();
		d1.PI = 4.44;
		StaticDemo d2 = new StaticDemo();
		StaticDemo d3 = new StaticDemo();
		
		System.out.println(d1.PI);
		System.out.println(d2.PI);
		System.out.println(d3.PI);
		
	}
}

class StaticDemo {
	int a = 10;
	static double PI = 3.14;
	public static void print() {
		System.out.println("PI = " + PI);
	}
}
