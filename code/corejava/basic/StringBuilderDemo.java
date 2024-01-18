public class StringBuilderDemo
{
	public static void main(String args[])
	{
		StringBuilder sb = new StringBuilder("Hello");
		System.out.println(sb); // Hello
		sb.append(" Java");  
		System.out.println(sb); // Hello Java
		sb.insert(6, "String ");	
		System.out.println(sb); // Hello String Java
		sb.insert(0, "Good Morning,");	
		System.out.println(sb); // Good Morning,Hello String Java
		System.out.println(sb.indexOf("J"));
		sb.replace(0, 12, "GM");
		System.out.println(sb);
		sb.reverse();			
		System.out.println(sb); // avaJ gnirtS olleH
	}
}