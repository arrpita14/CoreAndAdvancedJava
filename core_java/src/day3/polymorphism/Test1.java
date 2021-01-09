package day3.polymorphism;

public class Test1 {

	public static void main(String[] args) {
		Animal a1 = new Animal();
		a1.sound();
		
		Pig a2 = new Pig();
		a2.sound();
		
		Animal a3 = new Dog();
		a3.sound();
	}

}
