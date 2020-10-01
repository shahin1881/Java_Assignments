package Section1_20_Questions;

public class Large_Element_Q3 {
	
	/*QUESTION: A integer array is given as input. find the difference between each element. 
               Return the index of the largest element which has the largest difference gap.
               input: {2,3,4,2,3}
               logic: 2-3=1,3-4=1,4-2=2,2-3=1
               2 is the max diff between 4 and 2,return the index of 4 i.e 2
               output:2*/

	public static void main(String[] args) {
		  int a[]= {2,3,4,2,3};
		  
		  int index= 0;
		  int location= 0;
		  for(int i=0;i<a.length-1;i++) {
			  int ans= a[i]-a[i+1];
			  if(index<ans) 
			  {
				  index=ans;
				  location=i;
				  
			  }
		  }System.out.println(location);
		  
		  
	}
	

	}


