import java.io.FileNotFoundException;
import java.io.FileReader;
/*
 * throw
 * -> throw is used inside method at statement level
 * -> throw must be followed with object of exception
 * -> to raise the exception manually
 * -> can throw one object at a time using throw keyword 
 * 
 * throws
 * -> Is use at the method declaration level
 * -> throws will be followed with exception class name
 * -> throws is use to propagate the exception
 * -> can declare more than one Exception classes.
 */


public class ThrowsDemo {
	public static void main(String[] args) {
		FileContentReader fileRead = new FileContentReader();
		try {
			fileRead.printFileData("test.txt");
		} catch(FileNotFoundException ex) {
			ex.getMessage(); // to print exception message
			ex.getClass().getName(); // to get the Exception class name
			ex.printStackTrace(); // to print the stack trace(Exception Details) 
			ex.getCause(); // get the exception parent access
		} catch(Exception ex) {
			
		}
	}
}

class FileContentReader {
	public void printFileData(String filePath) throws FileNotFoundException, RuntimeException, Exception {
		FileReader reader = new FileReader(filePath);
	}
}
