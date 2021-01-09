package day5.hashMapExamples;
import java.util.*;
public class Example5 {

	public static void main(String[] args) {
		
		Map<Integer, String> mapOfCities = new HashMap<Integer, String>();
		
		mapOfCities.put(10, "Pune");
		mapOfCities.put(13, "Mumbai");
		mapOfCities.put(83, "Sydney");
		mapOfCities.put(5, "Melbourne");
		mapOfCities.put(23, "Delhi");
		
	//	System.out.println(mapOfCities);
		
		Set<Integer> keysSet = mapOfCities.keySet();
		
		//using iterator-
		Iterator<Integer> i1 = keysSet.iterator();
		while(i1.hasNext()) {
			int key = i1.next();
			String city = mapOfCities.get(key);
			System.out.println(city);
		}
		
	}
}
