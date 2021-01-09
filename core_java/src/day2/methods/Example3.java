package day2.methods;
public class Example3 {
	//giving arguments to methods-
		public static int add(int x, int y) {
			int z=x+y;
			return z;
		}

		public static int subtract(int x, int y) {
			int z=x-y;
				return z;
		}

		public static void main(String[] args) {
			int result1 = add(4,5);
			int result2 = subtract(5,8);
			System.out.println(result1);
			System.out.println(result2);
		}
}