public class NumberCompare
{
	public static void main(String args[])
	{
		int a=11, b=11, c=23, d=34;

		if(a<=b && a<=c && a<=d) {
			System.out.println("Small : " + a);
		}
		else if(b<=a && b<=c && b<=d) {
			System.out.println("Small : " + b);
		}
		else if(c<=a && c<=b && c<=d) {
			System.out.println("Small : " + c);
		}
		else{
			System.out.println("Small : " + d);
		}

		if(a>=b && a>=c && a>=d) {
			System.out.println("Largest : " + a);
		}
		else if(b>=a && b>=c && b>=d) {
			System.out.println("Largest : " + b);
		}
		else  if(c>=a && c>=b && c>=d) {
			System.out.println("Largest : " + c);
		}
		else {
			System.out.println("Largest : " + d);
		}

	}
}
