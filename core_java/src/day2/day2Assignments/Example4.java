package day2.day2Assignments;
public class Example4 {
//reversing a number-
	public static void main(String[] args) {
		int num=1234, reverse = 0;
		for(; num!=0; num/=10) {
			int digit=num%10;
			reverse=reverse*10+digit;
		}
		System.out.println(reverse+" is the reversed number");
	}
}