package Section1_20_Questions;

public class Square_Q17 {
	
	/*QUESTION: Input a int array. Square the elements in even position and cube the elements 
	 *          in odd position and add them as result.
                input: {1,2,3,4}
                output: 1^3+2^2+3^3+4^2 */
	                    //1^5^5^7^2=82
	 

public static void main(String[] args) {
		

		int a[]={1,2,3,4};    //stored input value in a[] array.

		int ans= 0 ;
		for(int i=0;i<a.length;i++)
		{
			int k = i ;      //i value stored in k variable.
			if(k%2==0)      //1/2,2/2
			{
				double no = (double) a[i];          //2
				ans = ans + (int) Math.pow(no,2);  //all no.even 
			}
			else
			{
				double no = (double) a[i];            //1
				ans = ans + (int) Math.pow(no,3);     //type cast(int)and squre root math.pow....all no odd
			}
		}
		System.out.println(ans);
		
		
		
		
}	
}
