package day4.ArrayList;

import java.util.ArrayList;

public class Example2 {

	public static void main(String[] args) {
	ArrayList<String> cars = new ArrayList<String>();

cars.add("Volvo");
cars.add("Ford");
cars.add("Audi");
cars.add("Honda");
cars.add("Mazda");
	
System.out.println("Printing elements using for loop");
	for(int i=0; i<cars.size(); i+=1) {
		String  c1 = cars.get(i);
		System.out.println(c1);
	}
	
	}
	

}
