package day3.day3Assignments;

public class TestInheritance {

	public static void main(String[] args) {
		System.out.println("Calling methods from Grandfarher class-");
		GrandFather gf1 = new GrandFather();
		gf1.work();
		gf1.talk();
		
		System.out.println("Calling methods from mother class-");
		GrandFather gf2 = new Mother();
		gf2.work();
		gf2.talk();
		
		System.out.println("Calling methods from Child class-");
		GrandFather gf3 = new Child();
		((Mother) gf3).dance(); //to access protected methods of parent class use cast with the object of child class
		((Mother) gf3).stitch();
	gf3.work();	
		
	}

	
}
