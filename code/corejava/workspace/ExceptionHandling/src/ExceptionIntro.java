import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionIntro {
	public static void main(String[] args) {
		System.out.println("PROGRAM EXECUTION STARTED");
		int arr[] = {11,2,3,4,5,32,12,65,43,23};
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Index : ");
		try {
			int index = scan.nextInt();
			System.out.println("Value : " + arr[index]);
		}
		catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("Invalid Index provided. Please enter valid Index...");
		}
		catch(InputMismatchException ex) {
			System.out.println("Invalid Input. Please Provide Numeric value only..");
		}
		catch(Exception ex) {
			System.out.println("Something went wrong.. Try after sometime...");
		}
		finally {
			scan.close();
		}
		System.out.println("PROGRAM EXECUTION COMPLETED");
	}
}
