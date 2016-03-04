import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) 
	{
		
		int[] myNumbers = {2,3,6,8};
		//variable length arguments
		
		//call variable length method called sum()
		System.out.println(sum(1,2,3));
		System.out.println(sum(2,2,2,2,2,2,2,2));
		System.out.println(sum(myNumbers));
		
		
		
		
		
		
		
		//ArrayLists
		  //default capacity is 10
		ArrayList<String> studentNames = new ArrayList<String>(30);
		
		studentNames.add("Eric");
		studentNames.add("Bob");
		studentNames.add("Bill");
		
		/*
		for (int i = 0;i<studentNames.size();++i)
		{
			System.out.println(studentNames.get(i));
		}
		*/
		
		//adds a value at a specified position
		studentNames.add(1, "Jane");
		
		//remove an element
		studentNames.remove(2);
		
		//replace a value
		studentNames.set(0, "Chris");
		
		
		//implicit toString call
		System.out.println(studentNames);

	}
	
	public static int sum(int... numbers)
	{
		int total = 0;
		
		for (int x : numbers)
		{
			total += x;	
		}
		
		return total;
	}

}
