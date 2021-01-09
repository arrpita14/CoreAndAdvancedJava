package day8.jdbcAssignments;

import java.sql.*;
import java.util.*;
import utility.DBUtil;

public class Example4 {

	public static void main(String[] args) {
		Connection con = DBUtil.getMySQLDbConnection();
		String search = "select * from student where roll_number = ?";
		System.out.println("enter the roll number to search");
		Scanner sc = new Scanner(System.in);
		int roll_no = sc.nextInt();
		
		try{
			PreparedStatement st = con.prepareStatement(search);
			st.setInt(1, roll_no);
			ResultSet rs = st.executeQuery();
			
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
		sc.close();
	}
}
