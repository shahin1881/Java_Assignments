package Section1_20_Questions;

public class Negative_Q20 {
	
	/*QUESTION: Get a input string. Find if it is a negative number, if true return the absolute 
                value, in other cases return -1.
                input: "-123"
                output: 123
                
                input: "@123"
                output: -1*/

public static void main(String[] args) {
		
		   //String s = "-123";
		    
	       String s = "@123";                                                                                                                         //stored input value of string s.

		if(s.charAt(0)=='-')   
		{
			System.out.println(s.substring(1,s.length()));
		}
		else
		{
			System.out.println("-1");
		}
}		

}
