package day5.arrayList;

import java.util.ArrayList;

public class Floors {

	public static void main(String[] args) {
		ArrayList<Integer> floor = new ArrayList<Integer>();
		
		floor.add(7);
		floor.add(4);
		floor.add(15);
		floor.add(5);
		
		System.out.println("Printing number of floors in insertion order-");
		for(Integer i : floor) {
			System.out.println(i);
		}
	}

}
