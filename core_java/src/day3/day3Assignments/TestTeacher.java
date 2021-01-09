package day3.day3Assignments;

public class TestTeacher {

	public static void main(String[] args) {
	Teacher t1 = new Teacher(4301, "Sarika", "HCI", 2500, 'F');
	Teacher t2 = new Teacher(4301, "Sunita", "Stiching", 2510, 'F');
	Teacher t3 = new Teacher(4301, "Sunny", "Agriculture", 2520, 'M');
	Teacher t4 = new Teacher(4301, "Shubham", "Mechanical", 2530, 'M');
	
	Teacher[] arrayOfTeachers = {t1,t2,t3,t4};
	
	TestTeacher tt1 = new TestTeacher();
	tt1.displayAllTeachers(arrayOfTeachers);
	
	}
public void displayAllTeachers(Teacher[] arrayOfTeachers)  {
		for(Teacher i : arrayOfTeachers) {
			System.out.println(i);
		}
}
}
