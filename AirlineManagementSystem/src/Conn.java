import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class Conn {
	
	Connection c;
	Statement s;

	public Conn() {
		try {
			getClass();
			Class.forName("com.mysql.cj.jdbc.Driver");
			c = DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinemanagementsystem", "root", "root");
		    s = c.createStatement();
		} catch (Exception e) {
			e.printStackTrace();
			
		}
	}
}