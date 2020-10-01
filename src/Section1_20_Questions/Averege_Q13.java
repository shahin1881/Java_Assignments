package Section1_20_Questions;

//public class Averege_Q13 {
	
	/*QUESTION: Get a integer array as input. Find the average of the elements which are in the 
                position of prime index.
                input:{1,2,3,4,5,6,7,8,9,10}
                logic:3+4+6+8(the indeces are prime numbers)
                output:21*/
	//1   2  3  4  5  6  7  8  9  = values
	//0   1  2  3  4  5  6  7  8   =index position
	
	/*Def:   Prime numbers are divisible only by the number 1 or itself.                       
	         For example, 2, 3, 5, 7 and 11 are the first few prime numbers.*/

/*public static void main(String[] args) {
		
		int a[] =  {1,2,3,4,5,6,7,8,9,10};  //stored input value in a[] array.
        int ans = 0 ;                       // '0' value stored in ans.
    	
		for(int i=0;i<a.length;i++)        //3+4+6+8...0,1
		{
			int count = 0 ;
		for(int k=i;k<i;k++)            //k<i k smaller then i ....-0,0
			{
			
				if(i%k==0)                 //i =2,k=4 4%2=0
				{
					count++;               //3+4+6+8
				}
			}
			
			if(count==0)
			{
				ans = ans + a[i];
			}
		}System.out.println(ans);
		

}
}*/
	
public class Averege_Q13 {
	
public static void main(String[] args) {
		
		int a[] =  {1,2,3,4,5,6,7,8,9,10}; 
        int ans = 0 ;
		for(int i=2;i<a.length;i++)
		{
			int count = 0 ;
			for(int k=2;k<i;k++)
			{
				if(i%k==0)
				{
					count++;
				}
			}
			
			if(count==0)
			{
				ans = ans + a[i];
			}
		}System.out.println(ans);
		

}
}