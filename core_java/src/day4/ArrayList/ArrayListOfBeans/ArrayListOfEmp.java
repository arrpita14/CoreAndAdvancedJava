package day4.ArrayList.ArrayListOfBeans;

import java.util.ArrayList;

import day3.java_OOP.Employee; //importing the employee.java bean class from day3 package

public class ArrayListOfEmp {

	public static void main(String[] args) {
		//creating objects of the bean class
		Employee e1 = new Employee(93031, "Arpita");
		Employee e2 = new Employee(93032, "Ben");
		Employee e3 = new Employee(93033, "Clover");
		Employee e4 = new Employee(93034, "Denver");
		
		//adding the objects into ArrayList<Employee>
		ArrayList<Employee> empList = new ArrayList<Employee>();
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		
		//printing the arrayList
		for(Employee i : empList) {
			System.out.println(i);
		}
		
	}

}
