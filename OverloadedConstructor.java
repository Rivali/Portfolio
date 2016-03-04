
public class OverloadedConstructor 
{
	private double length;
	private double width;
	
	public OverloadedConstructor()
	{
		length = 0.0;
		width = 0.0;
	}
	
	public OverloadedConstructor(double len, double w)
	{
		length = len;
		width = w;
	}

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
}
