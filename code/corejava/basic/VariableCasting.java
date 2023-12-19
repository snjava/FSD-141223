public class VariableCasting
{
	public static void main(String ar[])
	{ 
		byte x = 10;
		x = (byte) (x + 5.1); // 15.1 - double (32 bits)  (byte + double)
		System.out.println(x);

		byte z = 127;
		z = (byte) (z + 120);  // -128  -> 0  -> 127
		System.out.println(z); // 500 // -12

		float f = 22.11f;
		f = (float) (f + 10.2); //  explicit Casting
		double d = f + 10.1; 
		System.out.println(f);
		System.out.println(d);
		
	}
}