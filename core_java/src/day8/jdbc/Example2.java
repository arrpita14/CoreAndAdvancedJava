package day8.jdbc;

import java.sql.*;

public class Example2 {

	public static void main(String[] args) {
		String driverClassName = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/java_training";
		String dbUserName = "root";
		String dbPassword = "root";

		try {
			Class.forName(driverClassName);
			System.out.println("Driver loaded");
			Connection con = DriverManager.getConnection(url, dbUserName, dbPassword);
			System.out.println("Connection is :" + con);
			
			String sql = "select * from login";
			// Statement or PreparedStatement
			// First giving demo using Statement
			
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery(sql); // for select queries, we use executeQury() method
			while(rs.next()) {
				
				//String userName = rs.getString(username);
				String userName = rs.getString("user_name");
				String password = rs.getString("password");
				
				
System.out.println("username is :"+userName);

System.out.println("password is :"+password);
				System.out.println("***********");
			}
			
			
		} catch (Exception e) {
			System.out.println("An exception occured: " + e);
		}

	}

}
