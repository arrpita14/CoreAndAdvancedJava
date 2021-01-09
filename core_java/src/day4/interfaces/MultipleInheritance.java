package day4.interfaces;

public class MultipleInheritance implements Calculator, Math {

	

	@Override
	public void add() {
		System.out.println("Performing addition");
	}

	@Override
	public void subtract() {
		System.out.println("Performing subtraction");
	}

}
