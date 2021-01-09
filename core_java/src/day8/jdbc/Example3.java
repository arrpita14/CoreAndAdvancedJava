package day8.jdbc;

import java.sql.*;
import com.mysql.jdbc.Statement;
//inserting data into Db using  statement

public class Example3 {

	public static void main(String[] args) {
	Connection con  = getMySQLDbConnection();
	String sql = "insert into login values('frontdesk', '0123')";
	try {
		java.sql.Statement st = con.createStatement();
		int result = st.executeUpdate(sql);
		if(result == 0 ) {
			System.out.println("Updation failed");
		} else {
			System.out.println("New entry updated successfully");
		}
		
		
		
	} catch(Exception e) {
		System.out.println("An exception occured:"+e);
	}
	
	}
	
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
		System.out.println("An exception occured : "+e);
	}
		return con;

}}
