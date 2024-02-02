import java.util.Scanner;

/*
 * 1. Exception Scenario Identification
 * 2. Identify the exception class and create Object of the Exception 
 * 3. The object of exception will be raise or throw
 */
public class ThrowThrows {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Age : ");
		int age = scan.nextInt();
		
		if(!(age>0 && age<=120)) {
			throw new InvalidInputException();
		}
		
		System.out.println("You have entered Age = " + age);
	}
}
