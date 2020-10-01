package Section1_20_Questions;

public class Extension_Q14 {
	
	/*QUESTION: Find the extension of a given string file.
                input: "hello.jpeg"
                output: "jpeg" */

public static void main(String[] args) {
		
		String s = "hello.jpeg";  //input value stored in string.
		
		int location = 0 ;       //location stored in one variable
		char c= '.';            //'.' to check where is the location of c.
		
		for(int i=0;i<s.length();i++)
		{
			if(c==s.charAt(i))   //check to where to find c eg(.) 
			{
				location = i ;
				//System.out.println(location);//locatio+5
			}
		}
		String ans = s.substring(location+1,s.length());//5+1(.)   //6 if you are know location
		System.out.println(ans);
		
		
		
}
}
