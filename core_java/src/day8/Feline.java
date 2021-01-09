package day8;

public class Feline {
int employeeAge;

public Feline(String ename) {
	System.out.println("Employee Name is:"+ename);
}

public void setEmployeeAge(int eage) {
	employeeAge=eage;
}

private int getEmployeeAge() {
	System.out.println("Employee age is:"+employeeAge);
	return employeeAge;
}

public static void main(String[] args) {
	Feline employeeData = new Feline("Ramesh");
	employeeData.setEmployeeAge(23);
	employeeData.getEmployeeAge();
}
	
}