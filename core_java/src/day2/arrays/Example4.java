package day2.arrays;

public class Example4 {

	public static void main(String[] args) {
		String[] cars = {"BMW" , "Honda" , "Volvo" , "Ford" };
		cars[0] = "Audi";
		cars[2] = "Mercedes";
		for(String i : cars) {
			System.out.println(i);
		}
	}

}
