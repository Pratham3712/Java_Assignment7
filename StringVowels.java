/*5.Write a JAVA program to create a method that takes a string as input
  and throws an exception if the string does not contain vowels.*/

package Java_Assignment7;

import java.util.Scanner;

public class StringVowels {
	public void AcceptString() throws Exception {
		Scanner sc = new Scanner(System.in);
		String str = new String();
		System.out.println("Enter a String");
		str = sc.next();
		str.toLowerCase();
		int flag = 0;
		for (int i = 0; i < str.length(); i++) {

			if ((str.charAt(i) == 'a') || (str.charAt(i) == 'e') || (str.charAt(i) == 'i') || (str.charAt(i) == 'o')
					|| (str.charAt(i) == 'u')) {
				flag = 1;
				break;
			}
		}
		if (flag == 1) {
			System.out.println("String contain vowels");
		} else {
			throw new Exception("String does not contain vowels...");
		}
	}

	public static void main(String[] args) throws Exception {
		StringVowels str = new StringVowels();
		str.AcceptString();

	}

}
