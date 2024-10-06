/*4.Write a program to read a string and convert to integer using try catch block*/

package Java_Assignment7;

import java.util.Scanner;

public class StringtoInt {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str;
		System.out.println("Enter a String");
		str = sc.next();
		try {
			Integer.parseInt(str);
			System.out.println(str);

		} catch (NumberFormatException e1) {

			System.out.println("Expected value is a Number not a Word or a Charachter");
		}

	}

}
