package day5.setExamples;

import java.util.*;

public class Example1 {

	public static void main(String[] args) {
		Set<Integer> hs1 = new HashSet<Integer>();
		hs1.add(4310);
		hs1.add(4320);
		hs1.add(4330);
		hs1.add(4340);

		for (Integer i : hs1) {
			System.out.println(i);
		}
	}

}
