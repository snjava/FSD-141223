/*
    *
   * *
  * * *
 * * * *
* * * * *
r=5
Column = space and star

    1
   1 2	
  1 2 3
 1 2 3 4 
1 2 3 4 5

    1
   2 2	
  3 3 3
 4 4 4 4 
5 5 5 5 5
*/

public class StarPattern1
{
	public static void main(String args[])
	{
		for(int r=1;r<=5;r++) { // ROW
			for(int s=5;s>r;s--) {  // SPACE
				System.out.print(" ");
			}
			for(int c=1;c<=r;c++) {  // STAR
				System.out.print(r + " ");
			}
			System.out.println();
		}
	}
}







