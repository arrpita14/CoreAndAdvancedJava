package day8.jdbcAssignments;

import java.sql.*;

//....................................connecting to the database java_training.................................................................
public class Example1 {

	public static void main(String[] args) {

		String DriverClassName = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/java_training";
		String DbUsername = "root";
		String DbPassWord = "root";
		
		try {
			Class.forName(DriverClassName);
			Connection con = DriverManager.getConnection(url, DbUsername, DbPassWord);
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
