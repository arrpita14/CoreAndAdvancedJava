package day1;

public class Example10 {

	public static void main(String[] args) {
		int x = 23;
		int b = x++;	 //post-increment
		System.out.println(b);
		System.out.println(x);
		
		int a = 56;
		int c = ++a; //pre-increment
		System.out.println(c);
		System.out.println(a);
	}

}
