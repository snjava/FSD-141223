public class StringFunctions
{
	public static void main(String args[])
	{
		String name = new String("Abc Xyz Xmn");
		System.out.println("Original : " + name);
		String s1 = name.toUpperCase();
		System.out.println("Upper case : " + s1);
		String s2 = name.toLowerCase();
		System.out.println("Lower case : " + s2);
		System.out.println("Length : " + name.length());
		System.out.println(name.charAt(2));
		System.out.println(name.indexOf('X'));	
		System.out.println(name.lastIndexOf('X'));

		String email = "           ";
		System.out.println(email.isEmpty());
		System.out.println(email.isBlank()); // JDK11
		
	}
}