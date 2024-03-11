import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertStaticData {
	public static void main(String[] args) {
		try {
			// 1. Register Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// 2. Create Connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fsd14dec","root","root");
			// 3. Create Statement
			PreparedStatement stmt = con.prepareStatement("INSERT INTO student VALUES(5, 'XYZ', '9999988888', 'Delhi', 22, 'F')");
			// 4. Execute Statement
			int count = stmt.executeUpdate();
			// 5. Close connection
			con.close();
			System.out.println("Total Rows Inserted : " + count);
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
