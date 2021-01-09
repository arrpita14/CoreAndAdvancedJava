package day2.methods;

public class TestExample5 {

	public static void main(String[] args) {
		/*while calling static methods, we can directly use className.method()
		 *  No need of creating new object of the class*/
		int result1 = Example5.add(4,5);
		int result2 = Example5.subtract(5,8);
		int result3 = Example5.multiply(5, 4);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);

}}
