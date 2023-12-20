public class OperatorDemo1
{
	public static void main(String ar[])
	{ 
		int x = 10;
		int y = 3;
		int add = x + y;

		System.out.println(add);	// 13
		System.out.println(x - y);	// 7
		System.out.println(x * y);	// 30
		System.out.println(x / y);	// 3
		System.out.println(x % y);	// 1

		System.out.println("===============");

		int a = 10;
		int b = 3;

		a += b;  // a = a + b  	// a=13, b=3
		a -= b;	 // a = a - b	// a=10, b=3
		b *= a;	 // b = b * a	// a=10, b=30
	
		System.out.println(a);
		System.out.println(b);

		System.out.println("===============");
		
		byte q = 10;
		//q = (byte) (q + 1);  // byte + int = int
		q += 1; // q = q + 1
		System.out.println(q); // 11
	}
}








