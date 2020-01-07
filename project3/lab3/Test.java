package lab3;

/*Joshua 
Loftus
ComSci 227
Section A*/

import java.util.Random;

public class Test {
	public static void main(String[] args) {
		double a = 1000000 % 7;
		int b[] = {1, 2, 3, 4, 5, 6, 0};
		System.out.println(b[(int) (a-1)]);
		
		int c = 42;
	    String d = "" + c; 
		int e = Integer.parseInt(d);
		System.out.println(e);

		
		System.out.println("Max Value is: " + Integer.MAX_VALUE);
		System.out.println("Min Value is: " + Integer.MIN_VALUE);
		int j = Integer.MAX_VALUE;
		int k = j + 1;
		int l = j + 2;
		int m = j + j;
		System.out.println("Max Value + 1 = " + k);
		System.out.println("Max Value + 2 = " + l);
		System.out.println("Max Value * Max Value = " + m);
		
		Random rand = new Random(137);
		System.out.println(rand.nextInt(6));
		System.out.println(rand.nextInt(6));
		System.out.println(rand.nextInt(6));
		System.out.println(rand.nextInt(6));
	}
}
