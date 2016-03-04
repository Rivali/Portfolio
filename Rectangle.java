
public class Rectangle 
{
	// Fields
	private double length;
	private double width;
	
	
	// Getters and Setters
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	
	// Constructor 
	public Rectangle()
	{
		
	}
	
	// Method....Get the area of the rectangle
	public double getArea()
	{
		return length * width;
	}
}
