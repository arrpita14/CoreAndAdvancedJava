package day2.loop;

public class Example4 {

	public static void main(String[] args) {
		for (int i=0; i<=10; i+=1) {
			if (i==4) { System.out.println(i+" execution stops here");
			break;
			}
			System.out.println(i);
		}
	}

}
