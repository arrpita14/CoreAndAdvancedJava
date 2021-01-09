package day4.localDates;

	import java.time.LocalDateTime; // Import the LocalDateTime class
	import java.time.format.DateTimeFormatter; // Import the DateTimeFormatter class

	public class Example2 {
	  public static void main(String[] args) {
	    LocalDateTime ldt1 = LocalDateTime.now();
	    System.out.println("Before formatting: " + ldt1);
	    DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

	    String formattedDate = ldt1.format(dtf1);
	    System.out.println("After formatting: " + formattedDate);
	  }
	}


