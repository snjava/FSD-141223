public class OperatorDemo2
{
	public static void main(String ar[])
	{ 
		int x = 10;
		int y = 3;
		int z = 10;

		System.out.println(x > y);  	// true
		System.out.println(y < z);	// true

		System.out.println(x < z);	// false
		System.out.println(x <= z);	// true

		System.out.println(x == z);	// true
		System.out.println(x != z);	// false
	}
}