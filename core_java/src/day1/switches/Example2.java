package day1.switches;
public class Example2 {
	public static void main(String[] args) {
		System.out.println("Showing lift position-");
		int height = (int) (Math.random()*4);
		System.out.println(height);
		switch(height) {
		case 1:
			System.out.println("Lift at first floor");
			break;
		case 2:
			System.out.println("Lift at second floor");
			break;
		case 3:
			System.out.println("Lift at third floor");
			break;
		case 4:
			System.out.println("Lift at fourth floor");
			break;
			default:
				System.out.println("Lift at ground floor");
		}
	}
}