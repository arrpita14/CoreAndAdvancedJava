package day7.fileHandling;

import java.io.*;

public class Example6 {
//deleting a file from directory
	public static void main(String[] args) {
		try {
File f1 = new File("D\\test1");
f1.mkdir();
boolean fileExixts = f1.exists();
if(fileExixts) {
	System.out.println("Folder exists");
	System.out.println("We are now deleting the folder");
	boolean deleteFolder = f1.delete();
	if(deleteFolder) {
		System.out.println("Folder deleted successfully!");
	} else {
		System.out.println("Unable to delete a folder");
	}
} else {
	System.out.println("Folder does not exist");
}

	} catch (Exception e) {
		System.out.println("Exception occured "+e);
	}

}}
