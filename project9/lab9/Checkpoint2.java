package lab9;

import java.io.File;
import java.util.ArrayList;

/*Joshua 
Loftus
ComSci 227
Section A*/

public class Checkpoint2 {
	public static void main(String[] args) {
		File f = new File(".");
		System.out.println(countFiles(f));
		
		System.out.println(findFiles(f));
		
		System.out.println(countPatterns(5));}	//works until about 55
	
	
	
	public static int countFiles(File f) {
		if (!f.isDirectory()) {
			return 1;} 
		else {
			File[] files = f.listFiles();
			return files.length;}
	}
	
	
	
	public static ArrayList<String> findFiles(File file) {
		ArrayList<String> arr = new ArrayList<String>();
		if (!file.isDirectory()) {
			arr.add(file.getName());}
		else {
			for (File f : file.listFiles()) {
				arr.addAll(findFiles(f));}
			}
		return arr;
	}


	
	public static int countPatterns(int n) {
		if (n == 0 || n == 1) {
			return n;}
		if (n == 2) {
			return 1;}
		if (n == 3) {
			return 2;}
		else {
			return countPatterns(n - 3) + countPatterns(n - 1);}
		}
}