
public class Truck extends Vehicle 
{

	public Truck() {
		super();
	}

	public Truck(int speed) {
		super(speed);
	}
	
	public int accelerate()
	{
		speed += 3;
		return speed;
	}
	
}
