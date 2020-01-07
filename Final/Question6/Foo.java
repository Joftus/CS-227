package Question6;
// Joshua Loftus ComSci 227 Section A
public class Foo implements Comparable<Foo>
	{
	
	public static void main(String args[])
		{
		String str1 = "";
		String str2 = "";
		//String str3 = "String method tutorial";
		
		int var1 = str1.compareTo(str2);
		System.out.println("str1 & str2 comparison: " + var1);
		}
	}
