public class ArrayMultiD
{
	public static void main(String args[])
	{
		int arr[][] = {{23,56},{76,54,32,78},{23,456,78},{23,65,8,98,56,23}};

		for(int r[] : arr) {
			for(int c : r) {
				System.out.print(c + "\t");
			}
			System.out.println();
		}		
	}
}