package day1.day1Assignments;

public class Example1 {

	public static void main(String[] args) {
		int i1 = (int) (Math.random()*101);
		System.out.println(i1);
		if(i1%2==0) {
			System.out.println(i1+" is even");
		} else {
			System.out.println(i1+" is odd");	
		}
	}

}
