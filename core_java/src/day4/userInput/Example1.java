package day4.userInput;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);

	    System.out.println("Enter name, age and salary:");

	    // String input
	    String name = sc1.nextLine();

	    // Numerical input
	    int age = sc1.nextInt();
	    double salary = sc1.nextDouble();

	    // Output input by user
	    System.out.println("Name: " + name);
	    System.out.println("Age: " + age);
	    System.out.println("Salary: " + salary);
	  }
	}


