package mini1;

/*Joshua 
Loftus
ComSci 227
Section A*/

public class a {
	public static void main(String[] args) {
		//System.out.println(a.countOccurrences("aa", "aaaaa", true));
		//System.out.println(a.countIterations(10, 1.0));
		//System.out.println(a.isLucasSequence("1 1 2 3 5 8 14"));
		//System.out.println(a.mergePreservingRuns("abc", "xyz"));
		//System.out.println(a.takeApartPreservingRuns("abbbcdeeeef"));
		}
	
	
	
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
		while (tpos < tlen || spos < slen) {
			if (tpos <= tlen) {
				result += tlist[tpos];
				tpos += 1;
				for (int ftpos = tpos; ftpos < tlen; ftpos += 1) {
					if (tlist[tpos].equals(tlist[tpos - 1])) {
						result += tlist[tpos];
						tpos += 1;}
					else {
						ftpos = tlen;}}}
			if (spos <= slen) {
				result += slist[spos];
				spos += 1;
				for (int fspos = spos; fspos < slen; fspos += 1) {
					if (slist[spos].equals(slist[spos - 1])) {
						result += slist[spos];
						spos += 1;}
					else {
						fspos = slen;}}}}
		return result;}
	
	
	
	
	public static java.lang.String takeApartPreservingRunsOld(String s) {
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

}