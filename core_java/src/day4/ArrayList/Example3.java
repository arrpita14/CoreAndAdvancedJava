package day4.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Example3 {

	public static void main(String[] args) {
	ArrayList<String> cars = new ArrayList<String>();

cars.add("Volvo");
cars.add("Ford");
cars.add("Audi");
cars.add("Honda");
cars.add("Mazda");

Collections.sort(cars); //prints alphabetically
Collections.sort(cars, Collections.reverseOrder()); //prints reverse alphabetically
	
System.out.println("Printing elements using for-each loop");
	for(String i : cars) {
		System.out.println(i);
	}
	}
	

}
