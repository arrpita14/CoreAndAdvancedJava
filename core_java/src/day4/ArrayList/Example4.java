package day4.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Example4 {

	public static void main(String[] args) {
		//ArrayList of salaries(int)
		ArrayList<Integer> salaries = new ArrayList<Integer>();
		salaries.add(35000);
		salaries.add(45000);
		salaries.add(15000);
		salaries.add(25000);
		Collections.reverse(salaries); //prints reverse arrayList
		Collections.sort(salaries, Collections.reverseOrder());//prints in reverse order
		for(int i : salaries) {
			System.out.println(i);
		}
	}
	}
		
	