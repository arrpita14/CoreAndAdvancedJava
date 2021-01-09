package day7.exceptions.user_defined_exceptions;

public class AgeNotFoundException extends Exception {
	
	//default constructor
public AgeNotFoundException() {
	System.out.println("Age must be more than 18");
}

//parameterised constructor
public AgeNotFoundException(String message) {
	System.out.println(message);
}
}
