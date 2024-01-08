import java.util.Scanner;
public class ScannerDemo {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Name : ");
		String name = scan.next();

 		System.out.println("Enter Number-1 : ");
		int num1 = scan.nextInt();

		System.out.println("Enter Number-2 : ");
		int num2 = scan.nextInt();

		System.out.println("Name : " + name);
		int result = num1 + num2;
		System.out.println("Add : " + result);
	}
}