package lab10;

// Joshua Loftus ComSci 227 Section A
public class IntListTest
	{
	
	public static void main(String[] args)
		{
		IntListSorted list = new IntListSorted();
		list.add(5);
		list.add(4);
		list.add(3);
		list.add(2);
		list.add(6);
		list.add(8);
		System.out.println(list);
		System.out.println("Size: " + list.size());
		System.out.println("Min: " + list.getMinimum());
		System.out.println("Max: " + list.getMaximum());
		System.out.println("Median: " + list.getMedian());
		}
	}
