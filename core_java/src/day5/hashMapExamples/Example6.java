package day5.hashMapExamples;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Example6 {

	public static void main(String[] args) {
		// HashMap<Integer, Integer> mapOfStatesAndCities = new HashMap<Integer,
		// Integer>();
		/* Interface */

		Map<String, String> mapOfStatesAndCities = new HashMap<String, String>();

		mapOfStatesAndCities.put("Pune", "Maharashtra");
		mapOfStatesAndCities.put("Kolkata", "WB");
		mapOfStatesAndCities.put("Nagpur", "Maharashtra");
		mapOfStatesAndCities.put("Hyderabad", "Telangana");

		// System.out.println(mapOfStatesAndCities);

		Set<String> keysSet = mapOfStatesAndCities.keySet();
/*
		for (String x : keysSet) {
			String city = mapOfStatesAndCities.get(x);
			System.out.println(x + " " + city);
		}*/
		
		Iterator<String> i1 = keysSet.iterator();
		while(i1.hasNext()) {
			String key = i1.next();
			String city = mapOfStatesAndCities.get(key);
			System.out.println(city);
		}
	}

}
