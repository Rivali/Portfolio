
public class Inheritance {

	public static void main(String[] args) 
	{
		Vehicle car = new Car();
		Vehicle truck = new Truck();
		
		car.setSpeed(30);
		truck.setSpeed(30);
		
		System.out.println("The car accelerates from " + car.speed + " to " + car.accelerate());
		System.out.println("The truck accelerates from " + truck.speed + " to " + truck.accelerate());
	}

}
