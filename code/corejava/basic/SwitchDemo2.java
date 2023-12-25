/**
	M=Monday
	T=Tuesday, Thursday
	W=Wednesday
	F=Friday
	S=Saturday, Sunday
	any other char = Invalid Char
*/

public class SwitchDemo2
{
	public static void main(String args[])
	{
		char day = 'm';
		switch(day) {
			case 'M':
			case 'm':
				System.out.println("It's a Monday");
				break;
			case 'T':
				System.out.println("It's a Tuesday or Thursday");
				break;
			case 'W':
				System.out.println("It's a Wednesday");
				break;
			case 'F':
				System.out.println("It's a Friday");
				break;
			case 'S':
				System.out.println("It's a Saturday or Sunday");
				break;
			default:
				System.out.println("It's an Invalid Day...");
		}
	}
}