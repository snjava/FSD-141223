public class OperatorDemo3
{
	public static void main(String ar[])
	{
		int a = 10;
		a++;	// a = a + 1;  	// -- Post Increment 
		++a;	// a = a + 1;	// -- Pre Increment
		System.out.println(a);	// 12

		int x = 15;
		int z = x++;  //  z = 15, x = 16
		System.out.println(x);	// 16
		System.out.println(z);	// 15
		
		// Pre decrement = Operation, Update values and then Assign the value.
		// Post decrement= Assign the value, Operation and update the value
		
		int m = 22;
		int n = --m;  // m = 21, n = 21
		int l = n--;  // l = 21, n = 20
		System.out.println(m);	// 21
		System.out.println(n);	// 20
		System.out.println(l);	// 21

	}
}