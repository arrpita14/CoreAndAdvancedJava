package utility;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {
	public static Connection getMySQLDbConnection() {
		String driverClassName = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/java_training";
		String dbUserName = "root";
		String dbPassword = "root";
		Connection con = null;
		try {
			Class.forName(driverClassName);
			System.out.println("Driver loaded");
			con = DriverManager.getConnection(url, dbUserName, dbPassword);

		} catch (Exception e) {
			System.out.println("An exception occured : " + e);
		}
		return con;

	}
}
