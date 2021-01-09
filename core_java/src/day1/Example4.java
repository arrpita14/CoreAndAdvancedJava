package day1;

public class Example4 {

	public static void main(String[] args) {
		final int empId = 93031;
		String name = "Arpita";
		System.out.println("Changing empId-");
		/* final variables ki value change nahi kar sakte throughout the program.
		 * Aur agar change kiya toh error aayega
		 * empId = 93032; //yeh line error dega
		 */
		System.out.println("Employee Id is "+empId+" "+"Name is "+name);
	}

}
