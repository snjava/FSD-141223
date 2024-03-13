import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectData {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fsd14dec","root","root");
			PreparedStatement stmt = con.prepareStatement("select * from student");
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				System.out.println("Id : " + rs.getInt(1));
				System.out.println("Name : " + rs.getString("name"));
				System.out.println("Contact : " + rs.getString("contact"));
				System.out.println("City : " + rs.getString("city"));
				System.out.println("Age : " + rs.getInt("age"));
				System.out.println("Gedner : " + rs.getString("gender"));
				System.out.println("--------------------------------");
			}
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
