import java.util.Scanner;

public class DoWhileDemo {

	public static void main(String[] args) 
	{
		String input;
		double score1, score2, score3;
		double average;
		char repeat;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("This program calculates the average of the three test socres");
		
		do
		{
			System.out.print("Enter score #1: ");
			score1 = keyboard.nextDouble();
			System.out.print("Enter score #2: ");
			score2 = keyboard.nextDouble();
			System.out.print("Enter score #3: ");
			score3 = keyboard.nextDouble();
			
			// calculate the average
			average = (score1 + score2 + score3) / 3.0;
			System.out.println("The average is " + average);
			System.out.println();
			
			//does the user want to average another set 
			
			System.out.println("Would you like to average another set?");
			System.out.println("Enter Y for yes or N for no");
			input = keyboard.next();
			repeat = input.charAt(0);
			
		} while (repeat == 'Y' || repeat == 'y');

	}

}
