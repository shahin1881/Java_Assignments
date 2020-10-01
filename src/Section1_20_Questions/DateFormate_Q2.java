package Section1_20_Questions;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormate_Q2 {
	
	/*QUESTION: Find the day(Friday) of a date input given as MM-dd-yyyy (format).
                input:12-27-2012
                output:Thursday */
	
	
		public static void main(String[] args) throws Exception 
		{   
	       // String pattern = "yyyy-MM-dd";
		    String pattern = "MM-dd-yyyy";                    //"MM-dd-yyyy" stored in string pattern.
			SimpleDateFormat sd = new SimpleDateFormat(pattern);

			   
			//Date date = simpleDateFormat.parse("2020-04-13");
			 Date date = sd.parse("12-27-2012");
			// http://tutorials.jenkov.com/java-internationalization/simpledateformat.html
			
			SimpleDateFormat sdf = new SimpleDateFormat("EEEE");     //The pattern "EEEE" for Day of the week in full form
			String stringDate = sdf.format(date);
			System.out.println("The day is: "+stringDate);
		}
	}
















	// https://beginnersbook.com/2017/10/java-date-format-to-display-the-day-of-the-week/
	// https://www.javatpoint.com/java-simpledateformat
		
	/* The pattern "EEE" for Day of the week in short form
	 * such as "Mon", "Tue", "Wed" etc.
	 */

	/* The pattern "EEEE" for Day of the week in full form
	 * such as "Monday", "Tuesday", "Wednesday" etc.
	 */

	/*public static void main(String[] args) throws ParseException{
		String n = "10/05/2020";
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		Date dt1 = sdf.parse(n);

		sdf = new SimpleDateFormat("EEEE");
		System.out.println(sdf.format(dt1));
	}*/




	


