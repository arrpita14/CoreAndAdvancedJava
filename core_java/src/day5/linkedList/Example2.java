package day5.linkedList;

import java.util.Collections;
import java.util.LinkedList;

public class Example2 {

	public static void main(String[] args) {
		//ArrayList of salaries(int)
		LinkedList<Integer> salaries = new LinkedList<Integer>();
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
		
	