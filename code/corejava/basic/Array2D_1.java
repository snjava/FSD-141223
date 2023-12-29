public class Array2D_1
{
	public static void main(String args[])
	{
		int arr[][];
		arr = new int[2][3];
		arr[0][0] = 22;
		arr[0][1] = 23;
		arr[0][2] = 24;
		arr[1][0] = 33;
		arr[1][1] = 34;
		arr[1][2] = 35;

		for(int r=0;r<2;r++) {  // ROW
			for(int c=0;c<3;c++) {  // COLUMN
				System.out.println(arr[r][c]);
			}
		}

		System.out.println("-------------------------");

		for(int x[] : arr) {		// ROW
			for(int y : x ) {  // COLUMN
				System.out.println(y);
			}
		}
		
	}
}