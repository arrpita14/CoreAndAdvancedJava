package day1.strings;

public class Example8 {

	public static void main(String[] args) {
		 char c1 = '1';
	     // int i = (int) c1;
	      int a=Character.getNumericValue(c1);    
		 System.out.println(c1+"  "+a);
	        
	        double value = 22.2; //8 bytes
	        char c2 = (char) value;// 8 bytes to 2 bytes, compilation error
	        System.out.println(value+"  "+c2);
	        
	        long d1 = (long) 65.5;  
	         char ch = (char) d1; 
	         System.out.println(ch);   
	         
	         int m1 = 45, m2= 46;
	         int m3 = Math.max(m1, m2);
	         System.out.println(m3);
	         
	         int m4 = 45, m5= 46;
	       //  int m6 = Math.min(m1, m2);
	         System.out.println(Math.min(m4, m5));
	         
	         System.out.println(Math.abs(-34.45));
	         
	         System.out.println(Math.random()*78/78); //any random number between 0-10
	         
	         System.out.println(Math.random()*101); //any random number between 0-100
	}

}
