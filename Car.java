
public class Car extends Vehicle
{
	
	public Car() {
		super();
		
	}

	public Car(int speed) {
		super(speed);
		
	}

	public int accelerate()
	{
		speed += 10;
		return speed;
	}
}
