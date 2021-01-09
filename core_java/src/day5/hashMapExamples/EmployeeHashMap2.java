package day5.hashMapExamples;

import java.util.*;
import day3.java_OOP.Employee;

public class EmployeeHashMap2 {

	public static void main(String[] args) {
		Employee e1 = new Employee(4301, "Sarika");
		Employee e2 = new Employee(4302, "Nikita");
		Employee e3 = new Employee(4303, "Kalyani");
		Employee e4 = new Employee(4304, "Shubham");

		Map<Integer, Employee> hm1 = new HashMap<Integer, Employee>();
		hm1.put(93031, e1);
		hm1.put(93032, e2);
		hm1.put(93033, e3);
		hm1.put(93034, e4);

		System.out.println("Printing HashMap using Iterator-");
Set<Integer> keysSet = hm1.keySet();
		
		//using iterator-
		Iterator<Integer> i1 = keysSet.iterator();
		while(i1.hasNext()) {
			int key = i1.next();
			Employee emp = hm1.get(key);
			System.out.println( key + " "+emp);
		}
	}
}
