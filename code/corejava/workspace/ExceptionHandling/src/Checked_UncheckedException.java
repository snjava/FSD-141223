import java.io.FileNotFoundException;
import java.io.FileReader;

public class Checked_UncheckedException {
	public static void main(String[] args) {
		
		try {
			FileReader read = new FileReader("c:\\test.txt");
		}
		catch(FileNotFoundException ex) {
			
		}
		
		System.out.println(10/0);
		
	}
}
