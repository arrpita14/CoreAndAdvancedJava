package day7.exceptions.user_defined_exceptions;

public class Test {
	public static void checkAge(int age) throws AgeNotFoundException  {
		if (age < 18) {
			throw new AgeNotFoundException("Age is less than 18");
		} else {
			System.out.println("Age is greater than 18");
		}
	}

	public static void main(String[] args) {
		try {
			Test.checkAge(15);
		} catch (AgeNotFoundException e) {
			System.out.println(e.getMessage());}
		
	}
}
