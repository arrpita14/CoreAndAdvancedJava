package day8.jdbc;
import utility.DBUtil;
import java.sql.*;

import beans.Product;


public class Example7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Product product1 = new Product(1, "Mobile", 12000);
		Example7 example7 = new Example7();
		example7.add(product1);
		
	}
	
	public void add(Product product) {
		Connection con = DBUtil.getMySQLDbConnection();
		String sql = "insert into product values(?,?,?)";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, product.getProdId());
			ps.setString(2, product.getProdName());
			ps.setInt(3, product.getProdPrice());
			int result = ps.executeUpdate();
			if(result == 0) {
				System.out.println("failed");
			}
			else {
				System.out.println("successful");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
				
		
	}

}
