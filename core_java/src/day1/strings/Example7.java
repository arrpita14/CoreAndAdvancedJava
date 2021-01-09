package day1.strings;

public class Example7 {

	public static void main(String[] args) {
			int a = 4;
			int b =5;
			int c = a+b;
			System.out.println(c);
		
			int x = 10;
			String d = "45";
			String e = x+d;
			System.out.println(e);
			
			int i1 = 7;
			double d1 = i1;
			System.out.println(d1); //wide type-casting. Happens automatically. No data is lost
			
			double d2 = 45.345;
			int i2 = (int) d2; 
		System.out.println(i2); //narrow type-casting. Has to be done manually. Some data is lost
	}

}
