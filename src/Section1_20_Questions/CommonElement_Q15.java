package Section1_20_Questions;

public class CommonElement_Q15 {
	
	/*QUESTION: Get two integer arrays as input. Find if there are common elements in the arrays. 
                Find the number of common elements.
                input1: {1,2,3,4}
                input2: {3,4,5,6}
                output: 4(3,4,3,4) */

public static void main(String[] args) {
		
		int[] a= {1,2,3,4};            //stored input value in int[]a.
		int[]b= {3,4,5,6};            //stored input value in int[]b.
		int count=0;
		for(int i=0;i<a.length;i++) {
			int no1=a[i];           //a[i]value stored in no1.
			for(int j=0;j<b.length;j++) {
				int no2=b[j];      //b[j]value stored in no2.
				if(no1==no2) {    //compare of both. 
					count++;     //increment of count value.
				}
			}
		}System.out.println(count*2); //count*2=4
	}

}
