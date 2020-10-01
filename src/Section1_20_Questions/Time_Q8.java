package Section1_20_Questions;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Time_Q8 {
	
	/*QUESTION: A time input is received as stirng. Find if the hour format is in 12 hour format. 
                The suffix am/pm is case insensitive.
                input:"09:36 am"
                output:true*/

	public static void main(String[] args) {

		 String n = "09:36 PM";
		 String a[]=n.split(":");		
		 int h = Integer.parseInt(a[0]);  //type cast string to Integer
		 String x = a[1];	String r = "";//stored of r
		 for(int i=0;i<=1;i++)
		 {
			 r=r+x.charAt(i);
		 }
		 int m = Integer.parseInt(r);
		 
		 String j = DateTimeFormatter.ofPattern("hh:mm a").format(LocalTime.of(h,m));
		 
		 if(n.equalsIgnoreCase(j))
		 {
			 System.out.println("False");
		 }
		 else
		 {
			 System.out.println("True");
		 }
		
		
	}

}
