package day4.ArrayList;

import java.util.ArrayList;

public class Example1 {
	public static void main(String[] args) {
		
	
ArrayList<String> cars = new ArrayList<String>();
cars.add("Volvo");
cars.add("Ford");
cars.add("Audi");
cars.add("Honda");
cars.add("Mazda");
System.out.println(cars);
System.out.println(cars.get(0));
System.out.println(cars.get(2));


System.out.println("Updating values in ArrayList-");
cars.set(0, "Opal");
System.out.println(cars);

System.out.println("Total elements in ArrayList are "+cars.size());

System.out.println("Removing values in ArrayList-");
cars.remove(0);
System.out.println(cars);

System.out.println("Removing all values in ArrayList-");
cars.clear();
System.out.println(cars);


}}
