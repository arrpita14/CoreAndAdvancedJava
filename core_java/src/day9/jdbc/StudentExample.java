package day9.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import utility.DBUtil;

public class StudentExample {
/*create 3 methods
 * method1- to fetch all the student details from student table
 * method2- to fetch specific student using its roll number
 * method3- to fetch specific student using its name */
	public static void main(String[] args) {
StudentDao sd1 = new StudentDao();
//calling method1
sd1.getAllStudents();

//calling method2
System.out.println("Enter student roll number: ");
Scanner sc1 = new Scanner(System.in);
int rNum1 = sc1.nextInt();
sd1.getStudent(rNum1);

//calling method3
System.out.println("Enter Student name:");
Scanner sc2 = new Scanner(System.in);
String sName1 = sc2.nextLine();
sd1.getStudentUsingName(sName1);

//calling method4
sd1.deleteStudent(4310);
	}

	}

