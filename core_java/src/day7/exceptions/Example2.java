package day7.exceptions;

public class Example2 {
	public static void checkAge(int age) {
		if (age < 18) {
			throw new ArithmeticException("Age is less than 18");
		} else {
			System.out.println("Age is greater than 18");
		}
	}

	public static void main(String[] args) {
		Example2.checkAge(15);
		
	}
}
