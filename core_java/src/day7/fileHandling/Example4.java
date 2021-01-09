package day7.fileHandling;

import java.io.*;
import java.util.*;

public class Example4 {
//printing contents of a file
	public static void main(String[] args) {
		File f1 = new File("courses.txt");
		try {
			Scanner s1 = new Scanner(f1);
			while (s1.hasNext()) {
				String x = s1.nextLine();
				System.out.println(x);
			}
		} catch (Exception e) {
			System.out.println("An exception occured " + e);
		}

	}

}
