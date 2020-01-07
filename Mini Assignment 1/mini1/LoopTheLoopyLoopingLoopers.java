package mini1;

/*Joshua 
Loftus
ComSci 227
Section A*/

public class LoopTheLoopyLoopingLoopers {
/*-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Constructor*/
	private LoopTheLoopyLoopingLoopers() {}
	
	public static void main(String[] args) {
		//System.out.println(LoopTheLoopyLoopingLoopers.countOccurrences("aa", "aaaaa", true));
		//System.out.println(LoopTheLoopyLoopingLoopers.countIterations(10, 1.0));
		//System.out.println(LoopTheLoopyLoopingLoopers.isLucasSequence("1 1 2 3 5 8 14"));
		//System.out.println(LoopTheLoopyLoopingLoopers.mergePreservingRuns("abc", "xyz"));
		System.out.println(LoopTheLoopyLoopingLoopers.takeApartPreservingRuns("aaabcdefff"));
		}
	
	
	
/*-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Variables*/
	public double x;
	public double err;
	public String s;
	public String t;
	public String text;
	public boolean allowOverlap;
	
	


	
/*-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Static Methods*/
	public static int countIterations(double x, double err) {
		double answer = x;
		int count = 0;
		@SuppressWarnings("unused")
		double here = Math.abs(x - (answer * answer));
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
		if (result == len - 2 || len < 3) {
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
		int count1 = 1;
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
		String[] tlist = t.split("");
		String[] slist = s.split("");
		String result = "";
		int tlen = t.length();
		int slen = s.length();
		int tpos = 0;
		int spos = 0;
		if (tlen == 0 || slen == 0) {
			return t + s;}
		while (tpos <= tlen || spos <= slen) {
			if (tpos <= tlen) {
				result += tlist[tpos];
				tpos += 1;
				for (int ftpos = tpos; ftpos <= tlen; ftpos += 1) {
					if (tlist[tpos].equals(tlist[tpos - 1])) {
						result += tlist[tpos];
						tpos += 1;}
					else {
						ftpos = tlen;}}}
			if (spos <= slen) {
				result += slist[spos];
				spos += 1;
				for (int fspos = spos; fspos <= slen; fspos += 1) {
					if (slist[spos].equals(slist[spos - 1])) {
						result += slist[spos];
						spos += 1;}
					else {
						fspos = slen;}}}}
		return result;}
	
	
	
	
	
	public static java.lang.String takeApartPreservingRuns(String s) {
		boolean str = false;
		String[] list = s.split("");
		String s_1 = "";
		String s_2 = "";
		int len = list.length;
		int count = 1;
		while (count < len) {
			int bonus = 1;
			for (int fc = count; fc < len; fc += 1) {
				if (fc < len - 1 && list[fc].equals(list[fc + 1])) {
					if (str == false) {
						s_1 += list[fc + 1];}
					else {
						s_2 += list[fc + 1];}
					bonus += 1;}
				else{
					fc = len;}}
			if (str == false) {
				s_1 += list[count];
				str = true;}
			else {
				s_2 += list[count];
				str = false;}
			count += bonus;}
		String result = s_1 + " " + s_2;
		return result;}	
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
}