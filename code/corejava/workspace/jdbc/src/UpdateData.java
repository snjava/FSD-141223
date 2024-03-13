import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdateData {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Id : ");
		int id = scan.nextInt();
		System.out.println("Enter Name : ");
		String name = scan.next();
		try {
			// 1. Register Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// 2. Create Connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fsd14dec","root","root");
			// 3. Create Statement
			PreparedStatement stmt = con.prepareStatement("UPDATE student SET name=? WHERE id=?");
			stmt.setString(1, name);
			stmt.setInt(2, id);
			// 4. Execute Statement
			int count = stmt.executeUpdate();
			// 5. Close connection
			con.close();
			System.out.println("Total Rows Updated : " + count);
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
