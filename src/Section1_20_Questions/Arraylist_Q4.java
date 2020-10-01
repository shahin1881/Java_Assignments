package Section1_20_Questions;

public class Arraylist_Q4 {
	
	/*QUESTION: Given two arrayslist. retrieve the odd position elements form first input and even 
                position elemetns from second list. Put it into the new arraylist at the same 
                positions from where they are retrieved from.(consider 0th position as even position, and two 
                lists are of same size).
                input1:{12,1,32,3}
                input2:{0,12,2,23} 1+2=3   1+2+3=6
                output:{0,1,2,3}*/

	public static void main(String[] args) {

		int a[] = {12,1,32,3};                //1st and 3rd
		int b[] = {0,12,2,23};               //0 and 2nd
		int c []=new int[a.length+b.length];//output stored into  3 rd arraylist 
		int location =0;
		
		
	for(int i=1;i<a.length;i=i+2) {
		
		  c[i]=a[i];//1+3
		 location++;
	}
	for(int i=0; i<b.length;i=i+2) {
		c[i]=b[i];//0+2
		location++;
	}

	for(int i=0; i<location;i++)       //index value store location 4
	{
		System.out.print(c[i]);       //c[i] value stored 0123
	}
		
		


	}

}


		
		

