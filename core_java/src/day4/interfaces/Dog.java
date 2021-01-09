package day4.interfaces;

public class Dog implements Animal{

	@Override
	public void animalSound() {
		System.out.println("Dog is barking bow-bow");
	}

	@Override
	public void sleep() {
		System.out.println("Dog is sleeping Zzz...");
		
	}

}
