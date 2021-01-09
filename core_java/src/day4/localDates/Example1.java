package day4.localDates;

import java.time.*;

public class Example1 {

	public static void main(String[] args) {
		//display local date
		LocalDate ld1 = LocalDate.now(); 
		System.out.println(ld1);
		
		//display local time
		LocalTime lt1 = LocalTime.now();
		System.out.println(lt1);

	//display local date and time together-
		LocalDateTime ldt1 = LocalDateTime.now();
		System.out.println(ldt1);
	}

}
