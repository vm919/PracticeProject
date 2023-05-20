package PracticeQuestions;

import java.util.*;

/* Given a string, print only the part within the braces 
 * without using substring.
 * 
 * String: "Now let us see the (same) implementation"
 *
 * */
public class PrintStringInBraces {

	public static void main(String[] args) {
		String a = "Now let us see the (same) implementation";
		String s = "";

		List<Character> list = new ArrayList();
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) == '(') {
				i++;
				while (a.charAt(i) != ')') {
					System.out.print(a.charAt(i));
					i++;
				}
				break;
			}
		}
	}
}
