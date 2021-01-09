//question3. Aniket_93105
package day6CodeExamplesSaturday.allTestClasses;

import java.util.*;
import day6CodeExamplesSaturday.beans.Customer;

public class CustomerTest {

	public static void main(String[] args) {
		Customer c1 = new Customer(4310, "Arpita");
		Customer c2 = new Customer(4320, "Bipasha");
		Customer c3 = new Customer(4330, "Clover");
		Customer c4 = new Customer(4340, "Dereck");

		List<Customer> ar1 = new ArrayList<Customer>();
		ar1.add(c1);
		ar1.add(c2);
		ar1.add(c3);
		ar1.add(c4);

		// accessing elements of the array-list using Iterator
		System.out.println("Printing elements of the array-list using Iterator");
		Iterator<Customer> i1 = ar1.iterator();
		while (i1.hasNext()) {
			Customer cust = i1.next();
			System.out.println(cust);
		}

	}

}
