package day2.arrays;

public class Example5 {

	public static void main(String[] args) {
		int[][]  myNumbers = {{35,65,75} , {40,30,60}};
	for (int i =0; i<myNumbers.length; i+=1) {
		int[] innerArray = myNumbers[i];
		
		for(int j=0; j<innerArray.length; j+=1) {
			System.out.println(innerArray[j]);
		}
	}
		
	}}