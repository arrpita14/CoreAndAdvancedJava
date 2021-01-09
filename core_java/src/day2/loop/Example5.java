package day2.loop;

public class Example5 {

	public static void main(String[] args) {
		for (int i=0; i<=10; i+=1) {
			if (i==4) {
				System.out.println("skipping 4");
				continue;
			}
			System.out.println(i);
		}
	}

}
