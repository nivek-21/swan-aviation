package Database;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySQL {

	public Connection connection;

	public MySQL() {
		try {
			String USERNAME = "root";
			String PASSWORD = "";
			String DB_NAME = "swam_aviation";
			String DRIVER = "com.mysql.cj.jdbc.Driver";
			String URL = "jdbc:mysql://localhost:3306/" + DB_NAME + "?useTimezone=true&serverTimezone=UTC";

			Class.forName(DRIVER);
			connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (Exception e) {
			System.exit(0);
		}
	}
}
