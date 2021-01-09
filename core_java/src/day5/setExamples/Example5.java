package day5.setExamples;

import java.util.*;

import day3.java_OOP.Employee;

public class Example5 {

	public static void main(String[] args) {
		// create a Set<Employee> which stores 4 Employee objects
		// and then display using for-each loop

		Employee e1 = new Employee(4310, "Arpita");
		Employee e2 = new Employee(4320, "Ben");
		Employee e3 = new Employee(4330, "Charlie");
		Employee e4 = new Employee(4340, "Denver");

		Set<Employee> hs1 = new HashSet<Employee>();
		hs1.add(e1);
		hs1.add(e2);
		hs1.add(e3);
		hs1.add(e4);

		for (Employee i : hs1) {
			System.out.println(i);
		}
	}

}
