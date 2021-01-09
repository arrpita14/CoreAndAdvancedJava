//Question4. Ankur_93009

package day6CodeExamplesSaturday.allTestClasses;
import java.util.*;
import day6CodeExamplesSaturday.beans.Airport;

public class AirportTest {

	public static void main(String[] args) {
Airport a1 = new Airport(101, "Arpita", "04:30");
Airport a2 = new Airport(102, "Bob", "14:30");
Airport a3 = new Airport(103, "Clover", "12:30");
Airport a4 = new Airport(104, "Daisy", "04:45");

Set<Airport> hs1 = new HashSet<Airport>();
hs1.add(a1);
hs1.add(a2);
hs1.add(a3);
hs1.add(a4);

//Accessing values from HashSet using for-each loop
System.out.println("Accessing values from HashSet using for-each loop");
for(Airport x : hs1) {
	System.out.println(x);
}

	}

}
