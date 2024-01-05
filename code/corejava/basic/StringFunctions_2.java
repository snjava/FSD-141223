public class StringFunctions_2
{
	public static void main(String args[])
	{
		String name = new String("Abc Xyz Xmn");
		System.out.println(name); // Abc Xyz Xmn

		String arr[] = name.split(" ");	// Xmn Xyz Abc
		for(int i = 2 ; i>=0 ; i--) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		String lastName = name.substring(8);
		System.out.println(lastName);

		String firstName = name.substring(0, 3);
		System.out.println(firstName);

		char ch[] = name.toCharArray();
		for(int i = ch.length-1 ; i>=0 ; i--) {
			System.out.print(ch[i]);
		}
		
		// Abc Xyz Xmn  -> nmX zyX cbA
		System.out.println();
		String s1 = "Test";
		String s2 = " String";
		String s3 = " Java";
		System.out.println(s1.concat(s2).concat(s3)); // Test String Java
		System.out.println(s1 + s2 + s3); // Test String Java
		System.out.println(String.join("",s1,s2,s3)); // Test String Java
		

	}
}