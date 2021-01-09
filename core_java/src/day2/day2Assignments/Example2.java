package day2.day2Assignments;

public class Example2 {

	public static void main(String[] args) {
		int sum=0;
		int avg=0;
		int[] marks= {69, 85, 66, 80, 81};
		for(int i : marks) {
			 sum = sum+i;
		}
		System.out.println("Sum is "+sum);
		int z=marks.length;
		//System.out.println(z);
		avg=sum/z;
		System.out.println("Average is "+avg);
		}

}
