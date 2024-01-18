public class OverloadingDemo {
	public static void main(String[] args) {
		Addition obj = new Addition();
		obj.add(23, 44);
		obj.add(23.45, 44.765);
		obj.add("Hello", "Java");
		
		main(10);
	}
	
	public static void main(int a) {
		System.out.println("Main with int");
	}
	
	public static void main(String a) {
		System.out.println("Main with String");
	}
}

class Addition {
	public static final void add(int a, int b) {
		int result = (a+b);
		System.out.println("Addition of 2 int : " + result);
	}

	protected static final int add(int a, int b, int c) {
		int result = (a+b+c);
		System.out.println("Addition of 3 int : " + result);
		return result;
	}
	
	void add(double a, double b) {
		double result = a+b;
		System.out.println("Addition of 2 double : " + result);
	}
	
	public void add(String a, String b) {
		String result = a + " "+ b;
		System.out.println("Addition of 2 String : " + result);
	}
	
	private void add(char a, char b) {
		char result = (char) (a + b);
		System.out.println("Addition of 2 char : " + result);
	}
	
	public void add(int a, double b) {
		double result = (a+b);
		System.out.println("Addition of 1 int & 1 double : " + result);
	}
	
	public void add(double a, int b) {
		double result = (a+b);
		System.out.println("Addition of 1 double & 1 int : " + result);
	}
 }
