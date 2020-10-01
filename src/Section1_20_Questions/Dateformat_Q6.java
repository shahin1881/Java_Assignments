package Section1_20_Questions;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Month;
import java.util.Date;

	public class Dateformat_Q6 {
		
		/*QUESTION: Given date in dd-MM-yyyy format.return the month in full name format(January)
                    input:"23-01-2012"
                    output:January */

		public static void main(String[] args) throws ParseException {
			String n = "01/23/2012";                              //input value stored in string n.
			SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
			Date dt1 = sdf.parse(n);

			//sdf = new SimpleDateFormat("MMMM"+" "+"YYYY");
			sdf = new SimpleDateFormat("MMMMY");        //"MMMM" format of month.
			System.out.println(sdf.format(dt1));
			
		}

	}
	

