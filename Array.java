/*2.Create an integer array of size n and read the elements from the user .
Add an exception handling block to print the value at nth position of the array*/
package Java_Assignment7;
import java.util.Scanner;
public class Array 
{

	public static void main(String[] args) 
	{
		try {
		Scanner sc= new Scanner(System.in);
		int size;
		System.out.println("Enter size of Array A");
		size=sc.nextInt();
		System.out.println("Enter Elements for Array A");
		 int a[]=new int [5];
		 
		 for(int i=0;i<size;i++)
		 {
			 a[i]=sc.nextInt();
		 }
		 System.out.println("Displaying Elements of Array A");
		 for(int i=0;i<size;i++)
		 {
			System.out.println(a[i]);
		 }
		} catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Index 5 Out of Bound for Length 5...");
		}
		 
		
		

	}

}
