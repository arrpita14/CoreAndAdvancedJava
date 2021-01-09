package day7.fileHandling;
//writting into a file
import java.io.*;
public class Example3 {

	public static void main(String[] args) {
try {
	FileWriter fw1 = new FileWriter("courses.txt");
	fw1.write("Core java \n");
	fw1.write(" Trying second time \n");
	fw1.write(" Trying third time");
	fw1.close();
	System.out.println("Successfully wrote into the file");
} catch (Exception e) {
	System.out.println("An excception occured "+ e);}

	}

}
