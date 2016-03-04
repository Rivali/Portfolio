import java.util.Arrays;

public class BinarySelectionSort {

	public static void main(String[] args) {
		
		
		int[] numbers = {5,1,23,87,56,24,77};
		
		//selection sort
		selectionSort(numbers);
		
		
		int result = Arrays.binarySearch(numbers,24);
	
		
		if (result == - 1)
		{
			System.out.println("value was not found");
		}
		else
		{
			System.out.println("value was found at position " + result);
		}
		
		
		//binary search:
		/*
		 A binary search:
		 #1. requires an array sorted in ascending order.
		 
		 starts with the element in the middle of the array
		 if that element is the desired value, the search is over.
		 Otherwise, the value in the middle element is either greater or less than the desired value
		 If it is greater than the desired value, search in the first half of the array.
		 Otherwise, search the last half of the array.
		 Repeat as needed while adjusting start and end points of the search 
		 */
		
		

	}
	
	public static void selectionSort(int[] nums)
	{
		
		int startScan, index, minIndex, minValue;
		
		for (startScan = 0; startScan < nums.length - 1; startScan++)
		{
			minIndex = startScan;
			minValue = nums[startScan];
			for (index = startScan + 1; index<nums.length; index++)
			{
				
				if (nums[index] < minValue)
				{
					minValue = nums[index];
					minIndex = index;
				}
			}
			nums[minIndex] = nums[startScan];
			nums[startScan] = minValue;
			
		}
	}
	
	//BINARY SEARCH METHOD
	public static int binarySearch(int[] nums, int value)
	{
		int first, //first array element
		last, // last array element
		middle, // midpoint of search
		position; // position of search value
	boolean found; //flag
	
		//set the initial value
		first = 0;
		last = nums.length - 1;
		position = -1;
		found = false;
		
		// search for the value
		
		while (!found && first <= last)
		{
			middle = (first + last) / 2; // calc the mid point
			
			if (nums[middle] == value)
			{
				found = true;
				position = middle;
			}
			else if (nums[middle] > value) // if value is in lower half
			{
				last = middle - 1;
			}
			else
				first = middle + 1; // if the value is in upper half
		}
		
		//return the position of the item or -1 if it wasnt found
		return position;
	}

}
