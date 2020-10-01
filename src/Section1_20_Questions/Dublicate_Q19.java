package Section1_20_Questions;

import java.util.LinkedHashSet;

public class Dublicate_Q19 {
	
	/*QUESTION: Find no of characters in a given string which are not repeated.
                input: "hello"
                output: 3 */

	public static void main(String[] args) {
		String a="hello";    //stored input in a variable.
		String ans="";       //
		LinkedHashSet<Character>hm=new LinkedHashSet<>(); //Create set from array element.
		for(int i=0;i<a.length();i++) {   
			char c=a.charAt(i);                          //one by one value stored in c variable.
			hm.add(c);
		}
		for(char j:hm) {
			ans=ans+j;
		}
		System.out.println(ans);
		
				}
			
		}

		
	
		


