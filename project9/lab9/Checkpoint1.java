package lab9;

/*Joshua 
Loftus
ComSci 227
Section A*/

//)0

public class Checkpoint1 {
	public static void main(String[] args) {
		int[] test = {3, 4, 5, 1, 2, 6, 2}; // max should be 6
	    int result = maxValue(test);
	    System.out.println(result);
	    
	    System.out.println(getPrymidCount(7));
	    }
	
	
	
	public static int maxValue(int[] a) {
		return maxValueFinder(a, 0, a.length - 1);}
	
	
	
	public static int maxValueFinder(int[] a, int start, int end) {
		if (start == end) {
			return a[start];}
		else {
			int mid = (start + end) / 2;
			int leftLargest = maxValueFinder(a, start, mid);
			int rightLargest = maxValueFinder(a, mid + 1, end);
			if (leftLargest > rightLargest) {
				return leftLargest;}
			else {
				return rightLargest;}
			}
	}
	
	
	
	public static int getPrymidCount(int n) {
		if (n == 1) {
			return 1;}
		else {
			return n * n + getPrymidCount(n - 1);}
	}
}
