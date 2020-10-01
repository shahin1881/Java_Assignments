package Section1_20_Questions;

import java.text.ParseException;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DifferenceDate_Q7 {
	
	/*QUESTION: Two dates are given as input in "yyyy-MM-dd" format. Find the number of months 
                between the two dates.
                input1:"2012-12-01"
                input2:"2012-01-03"
                output:11*/

	/*public static void main(String[] args) {
		String n = "2012-12-01";			
		String j  = "2012-01-03";
	
				LocalDate d = LocalDate.of(2012,12,01);
				LocalDate x = LocalDate.of(2012,01,03);
				
				System.out.println(ChronoUnit.MONTHS.between(x,d));
				
				
		
		
		
		
	}

}*/


public static void main(String[] args) {

	// months between two date

	Scanner se = new Scanner(System.in);
	System.out.println("enter 1 date format=yyyy-mm-dd=");
	String n = se.next();
	System.out.println("enter 2 date format=yyyy-mm-dd=");
	String j = se.next();
	
	 /*String n = "2012-12-01";         
	 String j = "2012-01-03";*/      
	 
	// validate+dynamic
	
	// * LocalDate d = LocalDate.of(2013, 10, 01); LocalDate x = LocalDate.of(2012,
	// * 01, 01);
	 
	Period diff = Period.between(LocalDate.parse(n), LocalDate.parse(j));
	System.out.println(diff);
	//System.out.println(ChronoUnit.MONTHS.between(x, d));
}
}
