package day8.jdbcAssignments;
import java.util.*;

import beans.Student;
import utility.*;

import java.beans.Statement;
import java.sql.*;

public class Example5 {

	
	
	public static void main(String[] args) {

		Example5 example5 = new Example5();
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("rollno");
		int roll_number=sc.nextInt();
		
		System.out.println("name");
		String student_name=sc.next();
		
		System.out.println("course");
		String course=sc.next();
		
		System.out.println("duration");
		int duration=sc.nextInt();
		
		System.out.println("age");
		int age=sc.nextInt();
		
		Student student = new beans.Student(roll_number, student_name, course, duration, age);
		 example5.add(student);
		
	}
	public void add(Statement student) {
		try {
			Connection con = DBUtil.getMySQLDbConnection();
			
			String insert = "insert into student values (?,?,?,?,?);";
			PreparedStatement st =con.prepareStatement(insert);
			
			st.setInt(1, student.getRoll_number());
			st.setString(2, student.getStudent_name());
			st.setString(3, student.getCourse());
			st.setInt(4, student.getDuration());
			st.setInt(5, student.getAge());
			int result = st.executeUpdate();
			
			if(result == 0) {
				System.out.println("Failed");
			}
			else {
				System.out.println("successfull");
			}
			
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
