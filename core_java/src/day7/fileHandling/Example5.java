package day7.fileHandling;

import java.io.File;

public class Example5 {
//deleting a file-
	public static void main(String[] args) {
File f1 = new File("courses.txt");
boolean result = f1.exists();
	if(result) {
		System.out.println("File is present");
		System.out.println("Now deleting the file...");
		boolean deletionResult = f1.delete();
		if(deletionResult) {
			System.out.println("File deleted successfully!!");
		} else {
			System.out.println("Unable to delete file");
		}
	} else {
		System.out.println("File does not exist");
	}
	}

}
