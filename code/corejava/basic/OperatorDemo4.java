public class OperatorDemo4
{
	public static void main(String ar[])
	{
		int x = -10;
		System.out.println((x >= 1) & (x <= 50));  // F & T -> F
		System.out.println((x >= 1) | (x <= 50));  // F | T -> T

		int a = 10;
		int b = 5;
		System.out.println(a & b);  // 0
		System.out.println(a | b);  // 15
		
		boolean m = true;
		boolean n = false;
		System.out.println(m | n); // true

		//======================================
		
		int p = 10;
		System.out.println((p >= 1) && (p <= 50));  // T && T -> T
		
		
	}
}