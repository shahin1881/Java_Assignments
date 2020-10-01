package Section1_20_Questions;

public class ConcatString_Q11 {
	
	/*QUESTION:  Two input strings are accepted. If the two strings are of same length concat them 
                 and return, if they are not of same length, reduce the longer string to size of 
                 smaller one, and concat them.
                 input1:"hello"
                 input2:"hi" 
                 output:"lohi"
                 
                 input1:"aaa"
                 input2:"bbb"
                 output:"aaabbb"*/
	
	
	  /*Def:  Concatenation in the Java programming language is the 
	        operation of joining two strings together. You can join
	        strings using either the addition (+) operator or the String's concat() method.*/
	
public static void main(String[] args) {
		

		/* String n = "aaa";
		 String j = "bbb";*/
	
	   String n = "hello";
	   String j = "hi";

		String ans = "";             //"" used OUTPUT VALUE
		
		if(n.length()==j.length())  // it is compare to both length n & j.
		{
			ans = n.concat(j);      //concot used in additional of  joining two strings.eigther used(+)operator or the String's concat() method. 
		}
		else if(n.length()>j.length())
		{
			String f = n.substring(j.length()+1,n.length());  //j.length()+1 means concat used.
			ans = f.concat(j);                                //j length stored in ans.
		}
	else
		{	
			String d = j.substring(n.length()+1,j.length());  //n.length()+1 means concat used.
			ans = d.concat(n);                                //n length stored in ans.
		}
		System.out.println(ans);
		
		
		

}


	}


