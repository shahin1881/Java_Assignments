package Section1_20_Questions;

import java.util.Scanner;

public class Reverse_String_Q10 {
	
	/*QUESTION: Get a input string. reverse it and parse it with '-'.
                input:computer
                output:r-e-t-u-p-m-o-c*/
	
	
	/*Def:  Java program to reverse a string that a user inputs. 
	        The charAt method is used to get individual characters from the string, 
	        and we append them in reverse order. Unfortunately, there is no built-in method
	        in the "String" class for string reversal, but it's quite easy to create one.*/
	
public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in); //user take input in scanner class.
		System.out.println("enter string");
		String st= s.next();               // one by one value pass in s.next()method/
		
	   //String st ="computer";
	   //System.out.println(st.substring(2,6));//output mput :2nd m and 6th t= mput
		
	
		String ans="";  //"" used for didn'tspace for input value ......output
		
		
		for (int i=st.length()-1;i>=0;i-- ) { //used for loop string length in decreament reverse order.
			char c=st.charAt(i);              //charAt() method returns the character at the specified index in a string
			ans=ans+c+'-';                   //one by one value add ...and used '-'.
			
		}
		System.out.println(ans.substring(0,ans.length()-1));// used -1 menas remove (r-e-t-u-p-m-o-c-) end of the '-'.
		
	}

}

