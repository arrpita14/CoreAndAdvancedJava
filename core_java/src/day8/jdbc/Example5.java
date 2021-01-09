package day8.jdbc;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import utility.*;

import utility.DBUtil;

public class Example5 {
	public static void main(String[] args) {
		String username = "arpita";
		String password = "123";
		java.sql.Connection con = DBUtil.getMySQLDbConnection();

		try {
			String select = "select * from login where user_name = ?";
			PreparedStatement pst = con.prepareStatement(select);
			pst.setString(1, username);
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				String passwordDB = rs.getString(password);
				
				if(passwordDB.equals(password)) {
					System.out.println("Login successfull");
				} else {
					System.out.println("Login unsuccessfull");
				}
			}
			
			
		}
		 catch (Exception e) {
			System.out.println(("An exception occured :"+e));
		}
		} }	
	
