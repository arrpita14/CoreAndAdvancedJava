package day3.polymorphism;

public class Rhombus extends Square {
	protected void draw() {
		System.out.println("You can draw the Rhombus.");
	} //only child class can extend protected method
}
