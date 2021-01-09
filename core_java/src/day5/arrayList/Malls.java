package day5.arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Malls {
public static void main(String[] args) {
	ArrayList<String> malls = new ArrayList<String>();
	
	malls.add("Big Bazar");
	malls.add("Star Bazar");
	malls.add("Reliance Mart");
	malls.add("D mart");
	
	
	
	System.out.println("Printing malls in insertion order-");
	for(String i : malls) {
		System.out.println(i);
	}
	
//	System.out.println("Printing malls is alphabetical order-");
	//Collections.sort(malls);
	
	
}
}
