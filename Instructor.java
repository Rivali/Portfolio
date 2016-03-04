
public class Instructor 
{
	private String lastName,
				   firstName,
				   officeNumber;

	public Instructor(String lastName, String firstName, String officeNumber) 
	{
		this.lastName = lastName;
		this.firstName = firstName;
		this.officeNumber = officeNumber;
	}
	
	public Instructor(Instructor object2)
	{
		lastName = object2.lastName;
		firstName = object2.firstName;
		officeNumber = object2.officeNumber;
	}
	
	public void set(String lname, String fname, String office)
	{
		lastName = lname;
		firstName = fname;
		officeNumber = office;
	}
	
	public String toString()
	{
		String str = "Last Name: " + lastName
				+ "\nFirst Name: " + firstName
				+ "\nOffice Number: " + officeNumber;
		
		return str;
	}
	
				
}
