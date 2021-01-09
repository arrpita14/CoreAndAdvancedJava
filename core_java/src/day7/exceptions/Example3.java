package day7.exceptions;

public class Example3 {
	public static void checkAge(int age) throws Exception {
		if (age < 18) {
			throw new Exception("Age is less than 18");
		} else {
			System.out.println("Age is greater than 18");
		}
	}

	public static void main(String[] args) {
		try {
			Example3.checkAge(15);
		} catch (Exception e) {
			System.out.println("Something went wrong :"+e.getMessage());
		}
		
	}
}
