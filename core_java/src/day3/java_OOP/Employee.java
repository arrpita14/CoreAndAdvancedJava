package day3.java_OOP;

public class Employee {
private int employeeId;
private String employeeName;

//this is default constructor. no need of body
public Employee() {
	
}

//this is parameterised constructor
public Employee(int employeeId, String employeeName) {
	super();
	this.employeeId = employeeId;
	this.employeeName = employeeName;
}

/*private attributes ko main method main access karne ke liye use getter and setter method*/
public int getEmployeeId() {
	return employeeId;
}
public void setEmployeeId(int employeeId) {
	this.employeeId = employeeId;
}
public String getEmployeeName() {
	return employeeName;
}
public void setEmployeeName(String employeeName) {
	this.employeeName = employeeName;
}

@Override
public String toString() {
	return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + "]";
}



}
