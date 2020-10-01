package Section1_20_Questions;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Dateformat_Q12 {
	
	/*QUESTION: accept a string and find if it is of date format "dd/mmmm/yyyy".
                input:01/13/2012
                output:false*/
	
	/*def: The java. text. SimpleDateFormat class is used to both parse and format 
	       dates according to a formatting pattern you specify yourself. ... When 
	       formatting dates, the SimpleDateFormat typically formats a Date object 
	       into a String, although it can also format the date into a StringBuffer .*/

	
	public static void main(String[] args) {
		String n = "01/13/2012";           //stored date in a string.

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MMMM/yyyy");  //it is predefined method of SDF.create object in SDF.

		try {
			Date d = sdf.parse(n);          //pass of n string value.
			System.out.println("true");
		} catch (Throwable t) {
			System.out.println("false");
		}
	}

}
