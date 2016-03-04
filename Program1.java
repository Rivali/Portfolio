import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) 
	{
		// Create a Scanner object.
		Scanner keyboard = new Scanner(System.in);
		
		// Variables
		double testScore;
		int month;
		
		// Program
		System.out.println("If you get a C or higher on our test you are eligible for our month long course.");
		System.out.print("Enter the percentage you recieved on your test for a letter grade (7 point grading scale): ");
		
		testScore = keyboard.nextDouble();
		
		System.out.println();
		
		if (testScore < 0 || testScore > 100)
		{
			System.out.print("You must enter a score between 0 and 100: ");
			
			testScore = keyboard.nextDouble();
			
			System.out.println();
			
			if (testScore < 0 || testScore > 100)
			{
				System.out.println("Sorry, your test could not be graded.");
			}
			else if (testScore >= 93)
			{
				System.out.println("You got an A!");
			}
			else if (testScore >= 85)
			{
				System.out.println("You got a B");
			}
			else if (testScore >= 77)
			{
				System.out.println("You got a C");
			}
			else if (testScore >= 60)
			{
				System.out.println("You got a D");
			}
			else
			{
				System.out.println("You got an F");
			}
		}
		else if (testScore >= 93)
		{
			System.out.println("You got an A!");
		}
		else if (testScore >= 85)
		{
			System.out.println("You got a B");
		}
		else if (testScore >= 77)
		{
			System.out.println("You got a C");
		}
		else if (testScore >= 60)
		{
			System.out.println("You got a D");
		}
		else
		{
			System.out.println("You got an F");
		}
		
		if (testScore >= 77)
		{
			System.out.println("You are eligible for our class!");
			System.out.println();
			System.out.print("Which month would you like to take the class(Enter 1 - 12): " );
			month = keyboard.nextInt();
			
			//Switch statement to find out with month the user picked
			
			switch (month)
			{
				case 1:
					System.out.println();
					System.out.println("You are registered for our class in January!");
					break;
				case 2:
					System.out.println();
					System.out.println("You are registered for our class in February!");
					break;
				case 3:
					System.out.println();
					System.out.println("You are registered for our class in March!");
					break;
				case 4:
					System.out.println();
					System.out.println("You are registered for our class in April!");
					break;
				case 5:
					System.out.println();
					System.out.println("You are registered for our class in May!");
					break;
				case 6:
					System.out.println();
					System.out.println("You are registered for our class in June!");
					break;
				case 7:
					System.out.println();
					System.out.println("You are registered for our class in July!");
					break;
				case 8:
					System.out.println();
					System.out.println("You are registered for our class in August!");
					break;
				case 9:
					System.out.println();
					System.out.println("You are registered for our class in September!");
					break;
				case 10:
					System.out.println();
					System.out.println("You are registered for our class in October!");
					break;
				case 11:
					System.out.println();
					System.out.println("You are registered for our class in November!");
					break;
				case 12:
					System.out.println();
					System.out.println("You are registered for our class in December!");
					break;
				default:
					System.out.println();
					System.out.println("That is not a valid month");
			}
		}
		else
		{
			System.out.println("Sorry, you are not eligible for our class.");
		}
		
		keyboard.close();

	}
	

}
