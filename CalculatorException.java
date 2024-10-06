
package Java_Assignment7;

import java.util.Scanner;

class calculator extends Exception {
	private int num1, num2;

	public calculator(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}

	public void add() {
		System.out.println("Addition: " + (num1 + num2));
	}

	public void sub() {
		System.out.println("Subtraction: " + (num1 - num2));
	}

	public void mul() {
		System.out.println("Multiplication: " + (num1 * num2));
	}

	public void div() {
		System.out.println("Division: " + (num1 / num2));
	}

}

public class CalculatorException {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			String str, str1, str2;
			int num1, num2;

			do {
				System.out.println(".......Calculator.......");
				System.out.println("1. Addition");
				System.out.println("2. Subtraction");
				System.out.println("3. Multiplication");
				System.out.println("4. Division");
				System.out.println("5. Exit");

				System.out.println("-----------------------");
				System.out.println("Enter choice: ");
				int choice = sc.nextInt();

				switch (choice) {
				case 1:
					System.out.println("------------------------------");
					System.out.println("Enter the num1: ");
					str1 = sc.next();
					System.out.println("Enter the num2: ");
					str2 = sc.next();
					System.out.println("------------------------------");

					num1 = Integer.parseInt(str1);
					num2 = Integer.parseInt(str2);

					if (num1 < 0 || num2 < 0) {
						throw new ArithmeticException("Enter positive Number");
					} else {
						calculator cal = new calculator(num1, num2);
						cal.add();
					}

					break;
				case 2:
					System.out.println("------------------------------");
					System.out.println("Enter the num1: ");
					str1 = sc.next();
					System.out.println("Enter the num2: ");
					str2 = sc.next();
					System.out.println("------------------------------");
					num1 = Integer.parseInt(str1);
					num2 = Integer.parseInt(str2);
					if (num1 < 0 || num2 < 0) {
						throw new ArithmeticException("Enter positive Number");
					} else {
						calculator cal = new calculator(num1, num2);
						cal.sub();
					}

					break;
				case 3:
					System.out.println("------------------------------");
					System.out.println("Enter the num1: ");
					str1 = sc.next();
					System.out.println("Enter the num2: ");
					str2 = sc.next();
					System.out.println("------------------------------");
					num1 = Integer.parseInt(str1);
					num2 = Integer.parseInt(str2);

					if (num1 <= 0 || num2 <= 0) {
						throw new ArithmeticException("Enter positive Number");
					} else {
						calculator cal = new calculator(num1, num2);
						cal.mul();
					}

					break;
				case 4:
					System.out.println("------------------------------");
					System.out.println("Enter the num1: ");
					str1 = sc.next();
					System.out.println("Enter the num2: ");
					str2 = sc.next();
					System.out.println("------------------------------");
					num1 = Integer.parseInt(str1);
					num2 = Integer.parseInt(str2);

					if (num2 == 0) {
						throw new ArithmeticException("Cannot Divide by Zero");
					} else if (num1 < 0 || num2 < 0) {
						throw new ArithmeticException("Enter Positive Number");
					} else {
						calculator cal = new calculator(num1, num2);
						cal.div();
					}

					break;
				case 5:
					System.exit(choice);
				default:
					System.out.println("Please Enter a Valid Choice");
				}

				System.out.println("Do you want to continue (y/n): ");
				str = sc.next();

			} while (str.equalsIgnoreCase("y"));
			sc.close();
		} catch (NumberFormatException e) {
			System.out.println("Expected value is a Number not a Word or a Charachter");
		}

	}

}
