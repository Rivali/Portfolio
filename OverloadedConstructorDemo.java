
public class OverloadedConstructorDemo {

	public static void main(String[] args) 
	{
		OverloadedConstructor box1, box2;
		
		box1 = new OverloadedConstructor();
		System.out.println("The box1 object's length "
				+"and width are "
				+ box1.getLength() + " and "
				+ box1.getWidth());	
		
		box2 = new OverloadedConstructor(5.0,10.0);
		System.out.println("The box2 object's length "
				+"and width are "
				+ box2.getLength() + " and "
				+ box2.getWidth());

		
	}

}
