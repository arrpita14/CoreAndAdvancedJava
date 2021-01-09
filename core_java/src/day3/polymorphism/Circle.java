package day3.polymorphism;

public class Circle extends Shape  {
	public void area() {
		int r=2;
		double area = 3.14*r*r ;
		
		System.out.println("Area is= "+area);
	}
	public void circumference() {
		int side=0;
		int n=45;
		double c=2*3.14*n;
		System.out.println("Circumference is= "+c);
	}

}
