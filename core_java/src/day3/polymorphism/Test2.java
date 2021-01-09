package day3.polymorphism;

public class Test2 {

	public static void main(String[] args) {
		Shape s1 = new Shape();
		s1.area();
		
		Shape s2 = new Circle();
		s2.area();
		s2.circumference();
		
		Shape s3 = new Square();
		s3.area();
		s3.circumference();
		
		Square s4 = new Rhombus(); //object of child class can call protected method
		s4.draw(); 
		
				
	}

}
