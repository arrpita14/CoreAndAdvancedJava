package day2.day2Assignments;

public class TestCar {

	public static void main(String[] args) {
		car c1  = new car();
		String[] names =  c1.getCarName();
		c1.carName(names);
	System.out.println("speed is : "+c1.speed(45, 15)+"km/hr");	
		
		car.ignition();
		car.gear();
		
		for(int i=5; i<=20; i+=1) {
			if(i%3==0 && i%5==0)
			System.out.println(i);
		}
	}

}
