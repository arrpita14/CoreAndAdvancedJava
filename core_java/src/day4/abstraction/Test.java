package day4.abstraction;

public class Test {

	public static void main(String[] args) {
		//Animal a1 = new Animal();
		
		 /*we cannot create object of abstract class
		  * to resolve this- 
		  * 1- create a child class which extends the abstract class
		  * 2- add the unimplemented methods in the child class
		  * 3- now in the main method, create object of the child class
		  * and call all the abstract and normal methods */
		Animal a1 = new Pig(); 
		a1.animalSound();
		a1.sleep();
	}

}
