//Question2-Amruta_93013
package day6CodeExamplesSaturday.allTestClasses;

import java.util.*;
import day6CodeExamplesSaturday.beans.PersonalInfo;

public class PersonalInfoTest {

	public static void main(String[] args) {
		PersonalInfo pf1 = new PersonalInfo("Arpita", "Unmarried");
		PersonalInfo pf2 = new PersonalInfo("Vikas", "Married");
		PersonalInfo pf3 = new PersonalInfo("Bob", "Unmarried");
		PersonalInfo pf4 = new PersonalInfo("Sarika", "Married");

		List<PersonalInfo> ar1 = new ArrayList<PersonalInfo>();
		ar1.add(pf1);
		ar1.add(pf2);
		ar1.add(pf3);
		ar1.add(pf4);

		// accessing elements of array list using for-each loop
		System.out.println("Printing elements of array list using for-each loop");
		for (PersonalInfo x : ar1) {
			System.out.println(x);
		}

	}
}
