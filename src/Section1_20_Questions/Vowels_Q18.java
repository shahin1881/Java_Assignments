package Section1_20_Questions;

public class Vowels_Q18 {
	
	/*QUESTION: Check whether a given string is palindrome also check whether it has atleast 2 
                different vowels.
                input: "madam"
                output: false(no 2 diff vowels)*/
	
	//vowels =  a,e,i,o,u.
	/*Def:      A palindrome number is a number that is same after reverse. 
	            For example 545, 151, 34543, 343, 171, 48984 are the palindrome numbers. 
	            It can also be a string like LOL, MADAM etc.*/

	public static void main(String[] args) {
		/*
		 * String s = "madam"; StringBuffer sb = new StringBuffer(s); sb.reverse();
		 * String s1 = sb.toString(); int count = 0 ; if(s.equals(s1)) {
		 * System.out.println("given strig is palindrom"); }else {
		 * System.out.println("not palan"); }
		 * 
		 * LinkedHashSet<Character> hs = new LinkedHashSet<Character>(); for(int
		 * i=0;i<s.length();i++) { if((s.charAt(i)=='a' || s.charAt(i)=='A') ||
		 * (s.charAt(i)=='e' || s.charAt(i)=='E') || (s.charAt(i)=='i' ||
		 * s.charAt(i)=='I') || (s.charAt(i)=='o' || s.charAt(i)=='O') ||
		 * (s.charAt(i)=='u' || s.charAt(i)=='U')) { hs.add(s.charAt(i)); } }
		 * 
		 * 
		 * if(count==2) { System.out.println("true"); } else {
		 * System.out.println("false"); }
		 */
		int count = 0;
		char ch1 = 0;
		String s1 = new String("madam");
		StringBuffer sb = new StringBuffer(s1);
		String update = sb.reverse().toString();
		System.out.println(update);
		if (s1.equalsIgnoreCase(update)) {
			System.out.println("palidrome");
		} else {
			System.out.println("not palindrome");
		}

		for (int i = 0; i < s1.length() - 1; i++) {

			char ch = s1.charAt(i);
			count = 0;
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				for (int j = 1; j < s1.length(); j++) {
					if (ch == s1.charAt(j)) {
						count++;
					}
				}

			}
		}
		//if (count > 1) {
			if (count < 1) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
}
