package day2.arrays;

public class Example1 {

	public static void main(String[] args) {
		//array of string elements
		String[] cars = {"BMW" , "Honda" , "Volvo" , "Ford" };
		System.out.println(cars[0]); //accessing array elements using index value
		System.out.println(cars[1]);
		System.out.println(cars[2]);
		System.out.println(cars[3]);
		System.out.println(cars.length); //cars.length will give exact number of elements in the array

		//accessing array elements using for loop
		for (int i=0; i<cars.length; i++) {
			System.out.println(cars[i]);
		}
		
		//accessing array elements using for-each loop. Always use this
		for (String i : cars) {
			System.out.println(i);
		}
	}
}