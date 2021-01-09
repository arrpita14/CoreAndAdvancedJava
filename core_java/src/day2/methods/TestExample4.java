package day2.methods;

public class TestExample4 {
	//calling methods which are in other class
	public static void main(String[] args) {
		Example4 example4 = new Example4();
		int result1 = example4.add(5, 7);
		int result2 = example4.subtract(8, 13);
		
		System.out.println(result1);
		System.out.println( result2);}

}
