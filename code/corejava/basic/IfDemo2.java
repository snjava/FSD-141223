/**
	75-100 - Dest.
	60-75 - 1st Class
	50-60 - 2nd Class
	40-50 - Pass Class
	0-40 - Fail
	Any Other value - Invalid	
*/
public class IfDemo2
{
	public static void main(String args[]) {
		double per = 70.38;
		if(per>=40 && per<=100) {
			if(per>=75 && per<=100) {
				System.out.println("You got a Dest.");
			}
			else if(per>=60 && per<75) {
				System.out.println("You got a 1st class");
			}
			else if(per>=50 && per<60) {
				System.out.println("You got a 2nd class");
			}
			else if(per>=40 && per<50) {
				System.out.println("You got a pass class");
			}
		}
		else if(per>=0 && per<40) {
			System.out.println("You are Fail");
		}
		else {
			System.out.println("Invalid Percent....");
		}
		
	}
}