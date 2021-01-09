package day9.jdbc;

import beans.Product;
import utility.DBUtil;
import java.sql.*;

public class ProductExample {

	public static void main(String[] args) {
		Product product1 = new Product(2, "Mobile", 19000);
		ProductDao example1 = new ProductDao();
	//	example1.addProduct(product1);
	//	example1.getAllProducts();
	//	example1.getProduct(2);
	//	example1.deleteProduct(2);
		
		Product product = new Product(3, "Dining Table", 12000);
		example1.updateProduct(product);
		
	}
	}









