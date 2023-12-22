public class IfDemo1
{
	public static void main(String args[]) {
		int percent = -30;
		if(percent>=40 && percent<=100)
		{
			System.out.println("Pass");
		}
		else if(percent>=0 && percent<40)
		{
			System.out.println("Fail");
		}
		else
		{
			System.out.println("Invalid Percent...");
		}
	}
}