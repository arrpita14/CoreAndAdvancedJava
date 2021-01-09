package day7;

public class WrapperExample {

	public static void main(String[] args) {
		Integer a = 5;
		Integer a1 = 454545;
		Double b = 5.99;
		Character c = 'A';
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(" convert an Integer to a String, and use the length() method of the String class to output the length of the \"string\":");
		String s1 = a1.toString();
		System.out.println(s1.length());
	}

}
