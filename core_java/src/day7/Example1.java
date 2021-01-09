package day7;
import java.util.*;
public class Example1 {
	// demo of parameterized constructor of ArrayList
	// new ArrayList(Collection c)
	public static void main(String[] args) {
		Set<String> cars = new HashSet<String> ();
		cars.add("Honda");
		cars.add("Kia");
		
		List<String> ar1 = new ArrayList<String> (cars);
		displayListOfCars(ar1);
		
	}
	
	public static void displayListOfCars(List<String> list1) {
		for(String x : list1) {
		System.out.println(x);
		}
	}

}
