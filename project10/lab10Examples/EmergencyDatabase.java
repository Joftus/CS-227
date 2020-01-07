package lab10Examples;

import java.util.ArrayList;

// Joshua Loftus ComSci 227 Section A

public class EmergencyDatabase 
	{
	
	private ArrayList<Contact> list;
	
	
	
	public EmergencyDatabase()
		{
		list = new ArrayList<Contact>();
		}
		
		
		
	public void addContact(Contact c)
		{
		list.add(c);
		}
		
		
		
	public void alertEverybody(String alertMessage)
		{
		for (int i = 0; i < list.size(); ++i)
			{
			Contact c = list.get(i);
			c.notify(alertMessage);
			}
		}
	}
