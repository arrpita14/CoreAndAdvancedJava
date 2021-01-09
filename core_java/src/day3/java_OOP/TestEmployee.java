package day3.java_OOP;

public class TestEmployee {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		System.out.println(e1.getEmployeeId()); //getter method will help to fetch values from the class
		System.out.println(e1.getEmployeeName());
		
		System.out.println("Fetching updating values from Employee class-");
		
		e1.setEmployeeId(93031); //setter method will help to update values of the  attributes in the class
		e1.setEmployeeName("Arpita");
		
		System.out.println(e1.getEmployeeId());
		System.out.println(e1.getEmployeeName());
		
		System.out.println("Fetching values using parameterised constructor-");
		Employee e2 = new Employee(93032, "Denver");
		System.out.println(e2.getEmployeeId());
		System.out.println(e2.getEmployeeName());
		
		
		System.out.println("Fetching values using toString() method-");
		System.out.println(e2);
	}
	

}
