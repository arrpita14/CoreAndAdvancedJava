package day2.day2Assignments;

public class car {
public  void carName(String[] name) {
	for(String i : name) {
		System.out.println(i);
	}
}

public String[] getCarName() {
	String[] name = {"Alto" , "i10" , "i20" , "Indica"};
	return name;
}

public static void ignition() {
System.out.println("Car is starting");	
}

public static void gear() {
	int i = 0;
	if(i<=6) {
	for(i=1;i<5;i+=1) {
		System.out.println("Car is in "+i+"th gear");
	}}
	else {
			System.out.println("Apply breaks!");
		}
	}

public int speed(int d, int t) {
	int z = d/t;
	
	return z;
}
}
