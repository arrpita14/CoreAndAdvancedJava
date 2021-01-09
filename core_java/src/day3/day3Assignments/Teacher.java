package day3.day3Assignments;

public class Teacher {
private int tId;
private String tName;
private String tSub;
private double tSal;
private char tGender;

public int gettId() {
	return tId;
}
public void settId(int tId) {
	this.tId = tId;
}
public String gettName() {
	return tName;
}
public void settName(String tName) {
	this.tName = tName;
}
public String gettSub() {
	return tSub;
}
public void settSub(String tSub) {
	this.tSub = tSub;
}
public double gettSal() {
	return tSal;
}
public void settPhNum(double tSal) {
	this.tSal = tSal;
}
public char gettGender() {
	return tGender;
}
public void settGender(char tGender) {
	this.tGender = tGender;
}

public Teacher() {
	
}
public Teacher(int tId, String tName, String tSub, double tSal, char tGender) {
	super();
	this.tId = tId;
	this.tName = tName;
	this.tSub = tSub;
	this.tSal = tSal;
	this.tGender = tGender;
}
@Override
public String toString() {
	return "Teacher [tId=" + tId + ", tName=" + tName + ", tSub=" + tSub + ", tSal=" + tSal + ", tGender=" + tGender
			+ "]";
}


}
