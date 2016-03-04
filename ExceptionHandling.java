import java.io.*;
import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter the name of the file: ");
		String fileName = keyboard.nextLine();
		
		try
		{
			File file = new File(fileName);
			
			Scanner inputFile = new Scanner(file);
			
			System.out.println("File was found");
		}
		catch (FileNotFoundException e)
		{
			System.out.println("File was not found");
		}
		
		System.out.println("Done");
		
		
		

	}
	

}
