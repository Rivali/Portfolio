import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) 
	{
		// Variables
		double number;
		double totalArea;
		
		// Create a Scanner object
		Scanner keyboard = new Scanner(System.in);
		
		// Create Rectangle objects
		Rectangle kitchen = new Rectangle();
		Rectangle bedroom = new Rectangle();
		Rectangle den = new Rectangle();
		
		// Get and store the dimensions of the kitchen
		System.out.print("What is the kitchen's length? ");
		number = keyboard.nextDouble();
		kitchen.setLength(number);
		System.out.print("What is the kitchens's width? ");
		number = keyboard.nextDouble();
		kitchen.setWidth(number);
		
		// Get and store the dimensions of the bedroom
		System.out.print("What is the bedrooms's length? ");
		number = keyboard.nextDouble();
		bedroom.setLength(number);
		System.out.print("What is the bedrooms's width? ");
		number = keyboard.nextDouble();
		bedroom.setWidth(number);
		
		// Get and store the dimensions of the den
		System.out.print("What is the den's length? ");
		number = keyboard.nextDouble();
		den.setLength(number);
		System.out.print("What is the den's width? ");
		number = keyboard.nextDouble();
		den.setWidth(number);
		
		// Calculate the total area of the room
		totalArea = kitchen.getArea() + bedroom.getArea() + den.getArea();
		
		// Display the total area of the rooms
		System.out.println("The total area of the rooms is " + totalArea);
		
		keyboard.close();
	}

}
