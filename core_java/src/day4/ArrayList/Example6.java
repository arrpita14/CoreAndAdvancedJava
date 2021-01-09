package day4.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Example6 {

	public static void main(String[] args) {
	ArrayList<String> cars = new ArrayList<String>();

cars.add("Volvo");
cars.add("Ford");
cars.add("Audi");
cars.add("Honda");
cars.add("Mazda");

Collections.sort(cars); //rearrange alphabetically or numerically
	System.out.println("Printing elements using for-each loop");
	for(String i : cars) {
		System.out.println(i);
	}
	}
	

}
