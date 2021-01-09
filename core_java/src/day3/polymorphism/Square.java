package day3.polymorphism;

public class Square extends Circle {
	public void area() {
		int side=4;
		int area = side*side ;
		
		System.out.println("Area is= "+area);
	}
	public void circumference() {
		int side=4;
		int n=45;
		double c=4*45;
		System.out.println("Circumference is= "+c);
	}
	
	protected void draw() {
		System.out.println("You can draw the square.");
	} //this is a protected method. 
	
}
