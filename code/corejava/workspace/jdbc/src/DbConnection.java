import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fsd14dec","root","root");
			System.out.println("DB Connection Successful..");
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}

}
