package lab10Examples;

// Joshua Loftus ComSci 227 Section A

public abstract class Contact
	{
	
	private String firstName;
	private String lastName;
	
	
	
	public Contact(String givenFirstName, String givenLastName)
		{
		firstName = givenFirstName;
		lastName = givenLastName;
		}
		
		
		
	public String getName()
		{
		return firstName + " " + lastName;
		}
		
		
		
	public abstract void notify(String alertMessage);
	}
