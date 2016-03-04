import java.text.*;

public class ForLoopDemo {

	public static void main(String[] args) {
			
			// Table Header
			System.out.println("                Temperature (Degrees)");
			System.out.println("----------------------------------------------");
			System.out.println("   Celsius " + "                  Fahrenheit");
			
			// Decimal formatting
			NumberFormat df = DecimalFormat.getInstance();
		    df.setMaximumFractionDigits(2);
		    
			// Counter variable
			int count = 20;
			double fahrenheit;
			
			// For loop to calculate fahrenheit and display table data
			for(int i = 0; i<=count; i++){
				fahrenheit = 9/5.0*i+32;
				System.out.println("      " + i  + "                       " +  df.format(fahrenheit));
			}
	}
}