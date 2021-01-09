package day2.day2Assignments;

public class Example3 {

	public static void main(String[] args) {
		int[] salaries = {20000, 25000, 55000, 47000, 38000};
		int salaryToFind=55000;
		//System.out.println(salaries[2]);
		for(int i : salaries) {
			if(i==salaryToFind) {
				System.out.println("Found");
			}
		}
	}

}
