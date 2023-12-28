public class Array1D
{
	public static void main(String args[])
	{
		double percent[] = new double[6];
		percent[1] = 66.77;
		percent[3] = 77.71;
		percent[4] = 78.11;

		for(int i=0;i<=5;i++) {
			System.out.println(percent[i]);
		}

		System.out.println("-----------------------");
		
		for(double val : percent) {
			System.out.println(val);
		}
	}
}