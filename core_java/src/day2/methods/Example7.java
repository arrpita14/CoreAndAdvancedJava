package day2.methods;

public class Example7 {
	//method overloading
	public static int add(int x, int y) {
		int z=x+y;
		return z;
	}
	//1- method with same name and same return type but different number of parameters
	public static int add(int x, int y, int z) {
		int result=x+y+z;
		return result;
	}
}
