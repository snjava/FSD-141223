import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteData {
	public static void main(String[] args) {
		try {
			// 1. Register Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// 2. Create Connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fsd14dec","root","root");
			// 3. Create Statement
			PreparedStatement stmt = con.prepareStatement("DELETE FROM student WHERE id=4");
			// 4. Execute Statement
			int count = stmt.executeUpdate();
			// 5. Close connection
			con.close();
			System.out.println("Total Rows Deleted : " + count);
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
