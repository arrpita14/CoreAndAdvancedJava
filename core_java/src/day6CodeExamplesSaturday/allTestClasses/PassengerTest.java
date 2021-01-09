//Question6 Deeksha_93001

package day6CodeExamplesSaturday.allTestClasses;

import java.util.*;

import day3.java_OOP.Employee;
import day6CodeExamplesSaturday.beans.Passenger;

public class PassengerTest {

	public static void main(String[] args) {
		Passenger p1 = new Passenger("Arpita", 4310);
		Passenger p2 = new Passenger("Bob", 4320);
		Passenger p3 = new Passenger("Charlie", 4330);
		Passenger p4 = new Passenger("Discover", 4340);

		Map<Integer, Passenger> hm1 = new HashMap<Integer, Passenger>();
		hm1.put(100, p1);
		hm1.put(200, p2);
		hm1.put(300, p3);
		hm1.put(400, p4);

//Printing values of HashMap using for-each loop
		System.out.println("Printing values of HashMap using for-each loop");
		Set<Integer> s1 = hm1.keySet();
		for (Integer x : s1) {
			Passenger passenger = hm1.get(x);
			System.out.println(x + " " + passenger);
		}
	}
}
