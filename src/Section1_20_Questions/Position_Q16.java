package Section1_20_Questions;

public class Position_Q16 {
	
	/*QUESTION: Find if a given pattern appears in both the input strings at same postions.
                input1: "hh--ww--"
                input2: "rt--er--"
                output: true(false otherwise)*/

public static void main(String[] args) {
		
		String s = "hh--ww--";                                     //"hh--ww--" stored in string s.
		String s1 = "--yy--ru";
		
		// s1="rt--er--";                                        //"rt--er--" stored in string s1.
		int sa[]= new int[s.length()];		                    //sa[] stored in s.length.	
		int index= 0 ;
		int s1a[] = new int[s1.length()];	                     //s1a[] stored in s1.length.	
		int index1=0;
		char c = '-';                                               //'-' remove the space
		for(int i=0;i<s.length();i++)                            //for loop used in  s.length increment.
		{
			if(c==s.charAt(i))
			{
				sa[index] = i;                                          //0=h=?,1=h=?,2="-",             
				index++;
			}
		}
		
		for(int i=0;i<s1.length();i++)                         //for loop used in  s1.length increment.
		{
			if(c==s1.charAt(i))
			{
				s1a[index1] = i;  //0='_'
				index1++;
			}
		}

		
		int ans = 0 ;    
		
		for(int i=0;i<index;i++)                             //for loop used in  index value increment.
		{
			if(sa[i]==s1a[i])
			{
				ans++;
			}
		}
		
		if(index==ans)                                         //compare of index and ans.
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		
		
		
	}
}

