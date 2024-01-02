public class Calculation
{
	int a = 10;
	int b = 20;

	public static void main(String arg[]) {
		System.out.println("MAIN METHOD");

		Calculation cal;  // Reference Varaible
		cal = new Calculation(); // Object/instance of class

		System.out.println(cal.a);  // Variable access using object
		System.out.println(cal.b); 
		cal.add();  // accessing method using object
		cal.sub(23, 12);
		int result = cal.mul(2, 5);
	}

	// create method to sub 2 number and print their output get numbers from input parameter
	public void sub(int x, int y) {
		int ans = x - y;
		System.out.println("Sub : " + ans);
	}

	// create method to add 2 numbers and print their output
	public void add() {
		int ans = a + b;
		System.out.println("Add : " + ans);
	}

	// get 2 numbers from input param perform the multiplication and return the output
	public int mul(int x, int y) {
		int ans = x * y;
		System.out.println("Mul : " + ans);
		return ans;
	}
} 