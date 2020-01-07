package lab2;

/*Joshua 
Loftus
ComSci 227
Section A*/

public class StringTest {
	
	public static void main(String[] args) {
		String message;
		message = "Hello, world!";
		int theLength = message.length();
		System.out.println(theLength);
		System.out.println(message);
		char theChar = message.charAt(0);
		System.out.println(theChar);
		theChar = message.charAt(1);
		System.out.println(theChar);
		
		System.out.println(message.substring(0, 5));
		System.out.println(message.toUpperCase());
		System.out.println(message.replace('o', '*'));
	}
}
