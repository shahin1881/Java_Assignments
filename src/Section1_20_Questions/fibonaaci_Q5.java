package Section1_20_Questions;

public class fibonaaci_Q5 {
	
	/*QUESTION: Sum of fibonaaci series upto given input.
                sum of first 3 
                logic:1+1+2
                output:4*/
	
	   /*Def:   The Fibonacci series is a series where the next term
	            is the sum of pervious two terms. The first two terms of
	            the Fibonacci sequence is 0 followed by 1. The Fibonacci sequence: 0, 1, 1, 2, 3, 5, 8, 13, 21, ...*/
	
	public static void main(String[] args) {

		int first = 1;
		int sec   = 1;
		int third = 0;
		int n     = 3;
		int sum   = 0;

		for (int i = 1; i < n; i++) {                  //  1 start next i=2  next i<3 condition fail(i=<3)
			third = first + sec;                      //1+1=2......third stored 2.
			sum=sum+third;                           //0+2=2.......sum stored 2.
		
		
       }
		System.out.println(sum);
	}
}


	