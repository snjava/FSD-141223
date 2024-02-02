import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEnhancement {
	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in);) {   // --> Try with resource
			System.out.println("Enter 1st Number : ");
			int num1 = scan.nextInt();
			System.out.println("Enter 2nd Number : ");
			int num2 = scan.nextInt();
			
			System.out.println("Add : " + (num1 + num2));
			System.out.println("Div : " + (num1 / num2));
			System.out.println("Mul : " + (num1 * num2));
			System.out.println("Sub : " + (num1 - num2));
		} 
		catch(InputMismatchException | ArithmeticException ex) { // --> Catch with multiple exception type
			System.out.println("Someting went wrong.. Please try after some time.");
		}
		
	}
}
