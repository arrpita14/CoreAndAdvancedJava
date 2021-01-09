package day4.interfaces;

public class Vertebrate implements Animal, Reptile {

	@Override
	public void crawl() {
		System.out.println("Vertebrates can crawl");
	}

	@Override
	public void animalSound() {
		System.out.println("Vertebrates make specific sound");
	}

	@Override
	public void sleep() {
		System.out.println("Vertebrates also sleep");
		
	}

}
