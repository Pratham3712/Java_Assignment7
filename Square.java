/*1.Write a program to calculate the square value of any number given by the user .
Add an exception handling block to check whether the user enter letters instead of numbers*/

package Java_Assignment7;

import java.util.Scanner;
import java.util.InputMismatchException;
public class Square {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			int num1;
			System.out.println("Enter a Number");
			num1 = sc.nextInt();
			System.out.println("Square of " + num1 + " is " +Math.pow(num1, 2));
		} catch (InputMismatchException e1) {
			System.out.println("The Value Expected is a Number not a Character.....");
		}

	}

}
