package day2.arrays;

public class Example3 {

	public static void main(String[] args) {
		String[] ename = {"John", "Denver", "Roch", "Hazel"};
		/*System.out.println("Printing employee names-");
		for(String i : ename) {
			System.out.println(i);}*/
			
			int[] empid = {93031, 93032, 93033, 93034};
		/*	System.out.println("Printing employee Id-");
			for(int i : empid) {
				System.out.println(i);
			} */
			
			System.out.println("Printing employee names and Id together-");
			for(int i=0; i<ename.length; i+=1) {
				System.out.println(ename[i]+ " "+ empid[i]);
			}
		
	}

}
