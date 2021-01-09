package day3.day3Assignments;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		/*double num1, num2;
		char operator; */
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first number: ");
		double num1=scanner.nextDouble();
		System.out.println("Enter second number: ");
	double	num2=scanner.nextDouble();
		System.out.println("Select operator (+,-,*,/)");
		char operator=scanner.next().charAt(0);
		scanner.close();
		
		double output;
		
		switch(operator) {
		case '+' :
			output=num1+num2;
			break;
			
		case '-' :
			output=num1-num2;
			break;
			
		case '*' :
			output=num1*num2;
			break;
			
		case '/' :
			output=num1/num2;
			break;
			
			default :
				System.out.println("You have selected wrong operator");
				return;
		}
		
		System.out.println("Result is "+num1+operator+num2+"=5"+output);
	}

}
