package day5.setExamples;

import java.util.*;

public class Example3 {

	public static void main(String[] args) {
		Set<String> hs1 = new HashSet<String>();
		hs1.add("India");
		hs1.add("Bhutan");
		hs1.add("South Africa");
		hs1.add("Uzbekistan");

		for (String i : hs1) {
			System.out.println(i);
		}

	}
}
