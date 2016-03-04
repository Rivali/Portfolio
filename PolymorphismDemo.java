
public class PolymorphismDemo {

	public static void main(String[] args) 
	{
		GradedActivity[] tests = new GradedActivity[3];
		
		tests[0] = new GradedActivity();
		tests[0].setScore(95);
		
	
	
			System.out.println("Test 1: "+ "score " + tests[0].getScore() +
					", grade " + tests[0].getGrade());
		

	}

}
