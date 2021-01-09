package day2.day2Assignments;

public class Trial {

	public static void main(String[] args) {
		for ( int i=1; i<=100;i++) {
			if(i%3==0) {
				System.out.println("Fixx");
			}else if(i%5==0) {
				System.out.println("Buzz");
			} else if(i%3==0 && i%5==0) {
				System.out.println("FixxBuxx");
			} else {
				System.out.println(i);
			}
			
		}
	}

}
