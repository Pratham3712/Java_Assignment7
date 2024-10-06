/*3.Write a program to split a string containing two words using
StringTokenizer without using hasMoreTokens() method 
and call nextToken() method three times.
Add an exception handling block if necessary.*/

package Java_Assignment7;

import java.util.NoSuchElementException;
import java.util.StringTokenizer;

public class SplitString {

	public static void main(String[] args) {
		StringTokenizer str = new StringTokenizer("Happy Birthday");

		try {
			System.out.println("Token 1 " + str.nextToken());
			System.out.println("Token 2 " + str.nextToken());
			System.out.println(str.nextToken());

		} catch (NoSuchElementException e) {
			System.out.println("\nToken 3 is Null");
		}

	}

}
