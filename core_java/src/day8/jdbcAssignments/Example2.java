package day8.jdbcAssignments;

import java.sql.*;

public class Example2 {

	public static void main(String[] args) {
		
		String DriverClassName = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/java_training";
		String DbUserName = "root";
		String DbPassword = "root";
		try {
			Class.forName(DriverClassName);
			Connection con = DriverManager.getConnection(url, DbUserName, DbPassword);
			String sql = "select * from student;";
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) {
				String rollno = rs.getString("roll_number");
				String name = rs.getString("student_name");
				String course = rs.getString("course");
				String duration = rs.getString("duration");
				String age = rs.getString("age");
				
				System.out.println("\n rollno :"+rollno+"\n name :"+name+"\n course:"+course+"\n duration :"+duration+"\n age :"+age);
				
			}
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		

	}

}
