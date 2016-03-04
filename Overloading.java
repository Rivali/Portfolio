import java.util.Scanner;

/**
 * This program uses the MyMath class to
 * demonstrate overloaded methods.
 */

public class Overloading
{
	public static void main(String[] args) 
	{
		int iNumber;
		double dNumber;
		
		//create the scanner object
		Scanner keyboard = new Scanner(System.in);
		
		//get an integer to display its square
		System.out.print("Enter an integer: ");
		iNumber = keyboard.nextInt();
		System.out.println("That number's square is "
				+ MyMath.square(iNumber));
		
		//get a double to display its square
		System.out.print("Enter a double: ");
		dNumber = keyboard.nextDouble();
		System.out.println("That number's square is "
				+ MyMath.square(dNumber));
		
		keyboard.close();
	}
}
