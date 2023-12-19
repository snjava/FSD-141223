public class ValueTypes
{
	public static void main(String ar[])
	{ 
		int dec = 12;
		int octal = 012; // Octal (values start from 0)
		int binary = 0B1010; // Binary (value start from 0B or 0b) from JDK 1.7+
		int hex = 0X10; // Hex-dec (value start from 0X or 0x)
		
		System.out.println(dec); // 12
		System.out.println(octal); // 10 
		System.out.println(binary); // 10 
		System.out.println(hex); // 16
		
		int val = 0xCAFE;
		System.out.println(val);
	}
}