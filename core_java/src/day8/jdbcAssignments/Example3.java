package day8.jdbcAssignments;
import utility.*;
import java.sql.*;

public class Example3 {

	public static void main(String[] args) {
	
		Connection con = DBUtil.getMySQLDbConnection();
		
		try {
			String insert = "insert into student values ('304','JESS','Pharma','4','20')";
			Statement st = con.createStatement();
			int rs = st.executeUpdate(insert);
			int result = rs;
			if(result ==0) {
				System.out.println("Failed");
			}
			else {
				System.out.println("success");
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
