package mini1;

/*Joshua 
Loftus
ComSci 227
Section A*/

public class b {
/*-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Static Methods*/
	public static int countIterations(double x, double err) {
		double answer = x;
		int count = 0;
		while (Math.abs(x - (answer * answer)) > err) {
			answer = (answer + (x / answer)) / 2;
			count += 1;}
		return count;}
		
		
	
	
	
	public static String eliminateRuns(String s) {
		String result = ""; 
		String temp = "";
		int count = 0;
		int len = s.length();
		if (len == 0) {
			return "";}
		while (count < len - 1) {
			if (s.charAt(count) != s.charAt(count + 1)) {
				result += s.charAt(count);}
			else {
				temp = "" + s.charAt(count);
				s = s.replaceFirst(temp, " ");}
			count += 1;}
		result += "" + s.charAt(len - 1);
		return result;}
	
	
	
	
	
	public static int findSecondLargest(String text) {
		String[] numList = text.split(" ");
		String temp_s = "";
		int len = numList.length;
		int temp_n = 0;
		int count = 0;
		int first = 0;
		int second = 0;
		while (count < len) {
			temp_s = numList[count];
			temp_n = Integer.parseInt(temp_s);
			if (count == 0) {
				first = temp_n;}
			else if (first <= temp_n) {
				second = first;
				first = temp_n;}
			else if (first > temp_n) {
				if (second < temp_n) {
					second = temp_n;}}
			count += 1;}
		return second;}
	
	
	
	
	
	public static boolean isLucasSequence(String text) {
		String[] numList = text.split(" ");
		String temp_s = "";
		int len = numList.length;
		int count = 0;
		int temp_n = 0;
		int result = 0;
		int n_1 = 0;
		int n_2 = 0;
		
		while (count < len) {
			temp_s = numList[count];
			temp_n = Integer.parseInt(temp_s);
			if (count == 0) {
				n_2 = temp_n;}
			if (count == 1) {
				n_1 = temp_n;}
			if (n_1 + n_2 == temp_n && count != 0 && count != 1) {
				result += 1;}
			count += 1;
			n_2 = n_1;
			n_1 = temp_n;}
		if (result == len - 3 || len < 3) {
			return true;}
		else {
			return false;}}
	
	
	
	
	
	public static char findMostFrequentCharacter(String s) {
		char smost = ' ';
		int len = s.length();
		int wcount = 0;
		int nmost = 0;
		while (wcount < len) {
			int total = 0;
			char temp = s.charAt(wcount);
			for (int fcount = 0; fcount <= len - 1; fcount += 1) {
				if (temp == s.charAt(fcount)) {
					total += 1;}
				if (total > nmost) {
					nmost = total;
					smost = temp;}}
			wcount += 1;}
		return smost;}
	
	
	
	
	
	public static int countOccurrences(String t, String s, boolean allowOverlap) {
		String[] list = s.split("");
		int total = 0;
		int tlen = t.length();
		int slen = s.length();
		int count1 = 0;
		while (count1 < slen) {
			String comp = "";
			int add = 1;
			int count2 = 0;
			while (count2 < tlen) {
				if (count1 + count2 > list.length - 1) {
					return total;}
				comp += list[count1 + count2];
				count2 += 1;}
			comp += "";
			boolean test = comp.equals(t);
			if (test == true) {
				total += 1;
				if (allowOverlap == false) {
						add = tlen;}}
			count1 += add;}
		return total;}
		
		
	
	
	public static java.lang.String mergePreservingRuns(String t, String s) {
		String result = "";
		int tpos = 0;
		int spos = 0;
		while (tpos < t.length() && spos < s.length()) {
			char tprev = t.charAt(tpos++);
			char sprev = s.charAt(spos++);
			result += tprev;
			while (tprev < t.length() && t.charAt(tpos) == tprev) {
				result += tprev;
				tpos ++;}
			result += sprev;
			while(spos < s.length() && s.charAt(spos) == sprev) {
				result += sprev;
				spos++;}}
		while (tpos < t.length()) {
			result += t.charAt(tpos++);}
		while (spos < s.length()) {
			result += s.charAt(spos++);}
		return result;}
	
	
	
	
	public static java.lang.String takeApartPreservingRuns(String s) {
		String result1 = "";
		String result2 = "";
		int spos = 0;
		while (spos < s.length()) {
			char tprev = s.charAt(spos++);
			result1 += tprev;
			while (spos < s.length() && s.charAt(spos) == tprev) {
				result1 += tprev;
				spos ++;}
			char vprev = s.charAt(spos++);
			result2 += vprev;
			while (spos < s.length() && s.charAt(spos) == vprev) {
				result2 += vprev;
				spos++;}}
		return result1 + " " + result2;}
	
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
}
