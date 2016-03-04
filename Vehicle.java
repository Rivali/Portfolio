public class Vehicle 
{
	//fields
	protected int speed;

	
	
	
	
	//getters and setters
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	
	
	
	
	//constructor
	public Vehicle(int speed) {
		super();
		this.speed = speed;
	}
	
	
	
	
	//default constructor
	public Vehicle()
	{
		
	}
	
	
	
	
	//accelerate method
	
	public int accelerate()
	{
		speed += 5;
		
		return speed;
		
	}
	
	
	
	
	
	
	
}
