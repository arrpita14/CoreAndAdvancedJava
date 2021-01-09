package day4.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Example5 {
	/*
	* adding of values in arraylist using scanner and loops
	* run a for loop to add four cities in arraylist of string and then display all of them
	* names of cities should be received by user-input using Scanner
	*/
	public static void main(String[] args) {
		
		ArrayList<String> cities = new ArrayList<String>();
		Scanner s1 = new Scanner(System.in);
		Scanner s2 = new Scanner(System.in);
		
		System.out.println("How many cities do you want?");
		int cityCount=s2.nextInt();
		
		for(int i=0;i<cityCount;i++) {
			System.out.println("Please enter city name");
			String x = s1.nextLine();
			
			cities.add(x);
		}
		
		System.out.println("Printing ArrayList cities-");
		System.out.println(cities);
	}

}
