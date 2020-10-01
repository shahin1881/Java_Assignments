package Section1_20_Questions;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_Formate_Q2 {

public static void main(String[] args) throws ParseException {
		
		String s ="12-27-2012";//27-12-2012
		SimpleDateFormat sm= new SimpleDateFormat("mm-dd-yyyy");
		Date d= sm.parse(s);
		sm =new SimpleDateFormat("EEEE");
		System.out.println(sm.format(d));

		//--------------------mm- month
		//--------------------dd-date
		//-------------------yyyy-year
	}

}
