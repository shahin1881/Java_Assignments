package Section1_20_Questions;

import java.util.Scanner;

public class Sumodd_Q1 {

	  /* QUESTION:  A number is given as input. Find the odd digits in the number, 
                    add the input:52315
                    logic:5+3+1+5=14(even)
                    output:-1

                    input:1112
                    logic:1+1+1=3(odd)
                    output:1*/
	
	  /* Def:       Any integer that can be divided exactly by 2 is an even number.
	                The last digit is 0, 2, 4, 6 or 8. Example: −24, 0, 6 and 38 are all even numbers.*/


	public static void main(String[] args) {
		/*
		 * Scanner sc = new Scanner(System.in);//user take output classname variable keyword object system.in inputlene
		 * System.out.println("Enter Number:"); 
		 * int no = sc.nextInt(); //ONE BY ONE value user
		 * String sp=sc.next();
		 * System.out.println("enter the string");
		 */
         //even: 2/4/6/8/10....
		//odd:1/3/5/7/9
		
	      int no = 52315;
		//int no = 1112;
	    
		int add = 0;
		while (no != 0) {
			int rem = no % 10;               //  odd no by 3   //   devide given number  % 10  //   5,1,3,2,5
			if (rem % 2 != 0) {
				add = add + rem;            // 5+1+3+5=14   //14 is a even number
			}
			no = no / 10;
		}
		if (add % 2 == 0) {
			System.out.println("-1");    //even number print

		} else {
			System.out.println("1");    //odd number print
		}

	}
}
