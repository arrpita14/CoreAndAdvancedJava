package day7.fileHandling;
import java.io.*;
public class Example2 {
//creating file at a specified path
	public static void main(String[] args) {
		try {
			File f1 = new File("D:\\courses.txt");
			boolean result = f1.createNewFile();
			if(result) {
				System.out.println("File successfully created :"+f1.getName());
			} else {
				System.out.println("File already exists");
			}
		} catch (Exception e) {
			System.out.println("Exception occured "+e);
		}
	}

}
