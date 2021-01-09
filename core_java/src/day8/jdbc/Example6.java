package day8.jdbc;
import utility.*;
import java.util.*;
import java.sql.*;
public class Example6 {
	
	//validating the values from the database using scanner
	
	public static void main(String[] args) {
		
		String Username;
		String Password;
		Connection con = DBUtil.getMySQLDbConnection();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Username");
		Username =sc.nextLine();
		System.out.println("Enter password");
		Password = sc.nextLine();
		
		try {
			String select = "select * from login where user_name = ?";
			PreparedStatement pst = con.prepareStatement(select);
			pst.setString(1, Username);
			ResultSet rs = pst.executeQuery();
			
			if(rs.next()) {
			
				String passwordDB = rs.getString("password");
				if(passwordDB.equals(Password)) {
					System.out.println("Login successful");
				}
				
				else {
					System.out.println("Login failed");
				}
				
			}
			else {
				System.out.println("user not found");
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		sc.close();
	}

}
