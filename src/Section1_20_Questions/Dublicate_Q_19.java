package Section1_20_Questions;

public class Dublicate_Q_19 {

	// need know how to come output of a program
	/*19. Find no of characters in a given string which are not repeated.
		input: "hello"
		output: 3
	 */
			
		  public static int nonRepeatChar(String s1){     //s1=hello
	            StringBuffer sb = new StringBuffer(s1);  //5
	            for(int i=0;i < sb.length();i++){       // iterate 4 times sb.length 
	                  int n=0;
	                  for(int j = i+1;j < sb.length();j++)
	                        if(sb.charAt(i) == sb.charAt(j)){
	                              sb.deleteCharAt(j);
	                        n++;
	                  }
	                  if(n > 0){
	                        sb.deleteCharAt(i);
	                        i--;
	                  }
	            }
	            return sb.length();
	      }
	      public static void main(String[] args) {
	            String s1 = "hello";
	            System.out.println(nonRepeatChar(s1));
	      }
}
