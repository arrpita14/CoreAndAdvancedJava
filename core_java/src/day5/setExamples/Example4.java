package day5.setExamples;

import java.util.*;

public class Example4 {

	public static void main(String[] args) {
		Set<String> hs1 = new HashSet<String>();
		hs1.add("India");
		hs1.add("Bhutan");
		hs1.add("South Africa");
		hs1.add("Uzbekistan");

		Iterator<String> i1 = hs1.iterator();
		while (i1.hasNext()) {
			String x = i1.next();
			System.out.println(x);
		}
	}
}
