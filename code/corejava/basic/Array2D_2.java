public class Array2D_2
{
	public static void main(String args[])
	{
		int arr[][] = { {12,13,14,15},{21,22,23,24},{31,32,33,34} };

		for(int x[] : arr) {		// ROW
			for(int y : x ) {  // COLUMN
				System.out.print(y + "\t");
			}
			System.out.println();
		}
	}
}