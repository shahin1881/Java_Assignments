package Section1_20_Questions;

import java.util.Scanner;
/*Question:  input1=commitment;
             output=cmmtmnt;
              
              remove vowels from the string*/

public class DeleteVowels_Q32_2nd {

	public static void main(String args[])
	   {
	       String strOrig, strNew;
	       Scanner scan = new Scanner(System.in);
	       
	       System.out.print("Enter a String : ");
	       strOrig = scan.nextLine();
	       
	       System.out.print("Removing Vowels from The String [" +strOrig+ "]\n");
	       strNew = strOrig.replaceAll("[aeiouAEIOU]", "");
		   
	       System.out.print("All Vowels Removed Successfully..!!\nNow the String is :\n");
	              
	       System.out.print(strNew);
	       
	       
	       
	       /*String string = "commitment";
	   	System.out.println("Input String : "+string);
	   	string = string.replaceAll("[AaEeIiOoUu]", "");
	   	System.out.println(string);*/
	       
	       }
	       }
	
	
	