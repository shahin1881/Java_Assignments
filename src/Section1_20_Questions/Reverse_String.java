package Section1_20_Questions;

import java.util.Scanner;

public class Reverse_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


				
				Scanner s = new Scanner(System.in); //user take input
				System.out.println("enter string");
				String st= s.next();
	  			
			   //String st ="suraj";
			   //System.out.println(st.substring(2,6));//output input :2nd m and 6th t= input
				
				String ans="";
				
				
				for (int i=st.length()-1;i>=0;i-- ) {
					char c=st.charAt(i);
					ans=ans+c+'-';
					
				}
				System.out.println(ans.substring(0,ans.length()-1));
				
			}

		
}


