import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class databaseConnection {
	
	private static final String DRIVER= "org.apache.derby.jdbx.EmbeddedDriver";
	private static final String JDBC_URL= "jdbc:derby:SVB;create=true";
	
	Connection conn;
	
	public databaseConnection() {
		try {
			this.conn = DriverManager.getConnection(JDBC_URL);
			if(this.conn != null) {
				System.out.println("DOne");
			}
		}catch(SQLException e) {
			
			System.out.println("fail");
		}
	}
	
}
