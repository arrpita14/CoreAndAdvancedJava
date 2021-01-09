package day1.day1Assignments;
public class Example2 {
	public static void main(String[] args) {
		int year = (int) (Math.random()*101);
	System.out.println(year);
	boolean isLeap=true;
	
	if(year%4==0 && year%100==0 && year%400==0) {
		System.out.println("okay");
		System.out.println(isLeap);
		System.out.println(year+ " is  a leap year and has 366 days");
	} else {
		isLeap=false;
		System.out.println(isLeap);
		System.out.println(year+ " is not a leap year and has 365 days");
	}
	}
}