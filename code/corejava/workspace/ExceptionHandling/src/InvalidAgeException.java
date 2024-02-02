
/*
 * Steps To create custom exception
 * 1. Create a Java class
 * 2. Extends Exception or any subclass of the exception class on it.
 * 3. Provide you custom implementation inside exception class
 */
public class InvalidAgeException extends RuntimeException {
	public InvalidAgeException() {
		
	}
	public InvalidAgeException(String message) {
		super(message);
	}
	
	public void printError() {
		System.out.println("Invalid Age... Please Enter valid Age Value..");
	}
}
