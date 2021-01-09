package day9.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import utility.DBUtil;

public class StudentDao {
	//method1- to fetch all the student details from student table
	public void getAllStudents() {
		Connection con = DBUtil.getMySQLDbConnection();
		String sql = "select * from student";
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				int rNo = rs.getInt("roll_number");
				String sName = rs.getString("student_name");
				String sCourse = rs.getString("course");
				int rDuration = rs.getInt("duration");
				int rAge = rs.getInt("Age");
				
				System.out.println("Student roll number is:"+rNo);
				System.out.println("Student name is:"+sName);
				System.out.println("Student course is:"+sCourse);
				System.out.println("Student duration is:"+rDuration);
				System.out.println("Student age is:"+rAge);
				System.out.println("*******************");
				
			}
		} catch (SQLException e) {
			System.out.println("An exception occured: "+e);
			}
	}
	
	// method2- to fetch specific student using its roll number
	public void getStudent(int rNum1) {
		Connection con1 = DBUtil.getMySQLDbConnection();
		String search = "select * from student where roll_number = ?";
		
				try {
					PreparedStatement pst1 = con1.prepareStatement(search);
					pst1.setInt(1, rNum1);
					ResultSet rs1 = pst1.executeQuery();
					
					if (rs1.next()) {
						int a = rs1.getInt("roll_number");
						String x = rs1.getString("student_name");
						String x1 = rs1.getString("course");
						int y = rs1.getInt("duration");
						int y1 = rs1.getInt("age");

						System.out.println("Student roll number is:" + a);
						System.out.println("Student name is:" + x);
						System.out.println("Student course is:" + x1);
						System.out.println("Course duration is is:" + y);
						System.out.println("Student age is:" + y1);
					} else {
						System.out.println("Student not found");
					}
					
					

					
				} catch (Exception e) {
					System.out.println("An exception occurred :"+e);	}
	}
		
	//method3- to fetch specific student using its name			
				public void getStudentUsingName(String sName1) {
					Connection con2 = DBUtil.getMySQLDbConnection();
					String fetch2 = "select * from student where student_name = ?";
					try{
						PreparedStatement pst2 = con2.prepareStatement(fetch2);
						pst2.setString(1, sName1);
						ResultSet rs2 = pst2.executeQuery();
						
						if (rs2.next()) {
							int a = rs2.getInt("roll_number");
							String x = rs2.getString("student_name");
							String x1 = rs2.getString("course");
							int y = rs2.getInt("duration");
							int y1 = rs2.getInt("age");

							System.out.println("Student roll number is:" + a);
							System.out.println("Student name is:" + x);
							System.out.println("Student course is:" + x1);
							System.out.println("Course duration is is:" + y);
							System.out.println("Student age is:" + y1);
						} else {
							System.out.println("Student not found");
						}
					} catch(Exception e) {
						System.out.println("An exception occured: "+e);
					}
					
				}
				
				public void deleteStudent(int rNum) {
					Connection con3 = DBUtil.getMySQLDbConnection();
					String sql = "delete from student where roll_number=?";
					try {
						PreparedStatement pst3 = con3.prepareStatement(sql);
						ResultSet rs3 = pst3.executeQuery();
					while(rs3.next()) {
						System.out.println("Deleted successfully");
					} 
					} catch (Exception e) {
						System.out.println("An exception occured :"+e);
					}
					
				}
	}
