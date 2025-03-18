package javacore;
import java.util.Scanner;
public class EnumExample3 {
	
	enum Day {
		SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
	}
	public static void main(String args[]) {
		Scanner a = new Scanner (System.in);
		
		System.out.println("Enter a day.");
		
		String response = a.nextLine().toUpperCase();
		
		 Day day;
		    try {
		      day = Day.valueOf(response);
		    }catch(IllegalArgumentException e ) {
		      System.out.println("Invalis day entered");
		      
		      return;
		    }	
		switch (day) {
		case SUNDAY:
		case SATURDAY:
			System.out.println("Sunday is best");
			break;
		case MONDAY:
			System.out.println("Monday is bad");
			break;
			default:
				System.out.println("Other day are not bad");
		}}

}
