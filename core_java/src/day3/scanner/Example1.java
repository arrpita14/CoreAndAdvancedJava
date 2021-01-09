package day3.scanner;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
	Scanner s1 = new Scanner(System.in);
	System.out.println("Enter name- ");
	String name = s1.next();
	System.out.println("Enter Gender- ");
	char gender = s1.next().charAt(0);
	System.out.println("Enter age- ");
	int age = s1.nextInt();
	System.out.println("Enter phone number- ");
	long phoneNum = s1.nextLong();
	
	System.out.println("Name: "+name+" gender: "+gender+" age: "+age+" Phone Number:"+phoneNum);
	}

}
