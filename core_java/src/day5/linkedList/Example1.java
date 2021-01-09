package day5.linkedList;

import java.util.LinkedList;

public class Example1 {
	public static void main(String[] args) {
		
	
LinkedList<String> cars = new LinkedList<String>();
cars.add("Volvo");
cars.add("Ford");
cars.add("Audi");
cars.add("Honda");
cars.add("Mazda");
System.out.println(cars);
System.out.println(cars.get(0));
System.out.println(cars.get(2));


System.out.println("Updating values in LinkedList-");
cars.set(0, "Opal");
System.out.println(cars);

System.out.println("Total elements in LinkedList are "+cars.size());

System.out.println("Removing values in LinkedList-");
cars.remove(0);
System.out.println(cars);

System.out.println("Removing all values in LinkedList-");
cars.clear();
System.out.println(cars);


}}
