package Section1_20_Questions;

public class StringCompare_Q9 {
	
	/*QUESTION: find the max length-word in a given string and return the max-length word. 
                If two words are of same length return the first occuring word of max-length.
                input:"hello how are you aaaaa"
                output:hello(length-5)*/

	public static void main(String[] args) {

		int match = 0;
		String word = "";
		String str = ("hello how are you aaaaa");
		String split[] = str.split(" ");          //split used in space.
		for (int i = 0; i < split.length; i++) { //0
			String temp = split[i];
			if (match < temp.length()) {

			match = temp.length();
				word=temp;
			}

		}
		System.out.println(word);

	}

}
