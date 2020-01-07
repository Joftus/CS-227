package lab7;

import java.util.Arrays;
import java.util.Random;

/*Joshua 
Loftus
ComSci 227
Section A*/

public class Check1 {
	public static void main(String[] args) {
		int[] a = new int[8];
		a[0] = -6;
		a[1] = 4;
		a[2] = 3;
		a[3] = -2;
		//System.out.println(Check1.getPositiveNumbers(a));
		Check1.getPositiveNumbers(a);
		Check1.randomExperiment(10, 1000);
		}
	
	public static int[] getPositiveNumbers(int[] numbers) {
		int a = numbers.length;
		int len = a;
		int count = 0;
		int newIndex = 0;
		while (len > 0) {
			if (numbers[len - 1] < 0) {
				numbers[len - 1] = 0;}
			if (numbers[len - 1] == 0) {
				count ++;}
			len --;}
		int[] posNum = new int[a - count];
		for (int x = 0; x < a; x++) {
			if (numbers[x] != 0) {
				posNum[newIndex] =  numbers[x];
				newIndex ++;}}
		System.out.println(Arrays.toString(posNum));
		return posNum;
		}
	
	
	
	public static int[] randomExperiment(int max, int iters) {
		int givenCount = iters;
		int counts[] = new int[max];
		while (givenCount > 0) {
			Random rand = new Random();
			int num = rand.nextInt(max);
			counts[num] += 1;
			givenCount --;}
		System.out.println(Arrays.toString(counts));
		return counts;
	}
	
}
