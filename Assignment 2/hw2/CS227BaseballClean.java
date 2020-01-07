package hw2;

import java.util.Arrays;

/*Joshua 
Loftus
ComSci 227
Section A*/

//import java.util.Arrays;

public class CS227BaseballClean {
/*-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------	
Non-Private Global Variables*/
	public static final int STRIKE = 1;
	public static final int BALL = 0;
	public static final int POP_FLY = 2;
	public static final int MAX_BALLS = 4;
	public static final int MAX_OUTS = 3;
	public static final int MAX_STRIKES = 3;
	
	

	
	

	
/*-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Private Global Variables*/
	private int inning;
	private int team;
	private int numInnings;
	private int team1;
	private int team2;
	private int outs;
	private int strikes;
	private int balls;
	private int count = 1;
	private boolean playerOnFirst = false;
	private boolean playerOnSecond = false;
	private boolean playerOnThird = false;
	
	
	
	
	
	
	
/*-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Constructor*/
	public CS227BaseballClean(int givenNumInnings) {
		numInnings = givenNumInnings;}
	
	

	
	
	
	
/*-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------	
Int Methods*/	
	public int getBalls() {
		return balls;}
	
	
	
	
	

	public int getStrikes() {
		return strikes;}
	
	
	
	
	
	public int getOuts() {
		return outs;}
	
	
	
	

	public int getInning() {
		if (isOver() == true) {
			inning += 1;}
		return inning;}
	
	
	
	

	public int getScore(boolean team0) {
		if (team0 == true) {
			team = team1;}
		else {team = team2;}
		return team;}
	
	
	
	

	
	
	
	
/*-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------	
Boolean Methods*/
	public boolean isOver() {
		if (inning == numInnings + 1 && isTop() == true) {
			return true;}
		else {return false;}}
	
	
	
	

	public boolean isTop() {
		if (outs == 3) {
			count += 1;
			playerOnFirst = false;
			playerOnSecond = false;
			playerOnThird = false;
			outs = 0;}
		if ((count % 2) == 1) {
			return true;}
		else {return false;}}
	
	
	
	

	public boolean playerOnFirst() {
		return playerOnFirst;}
	
	
	
	

	public boolean playerOnSecond() {
		return playerOnSecond;}
	
	
	
	

	public boolean playerOnThird() {
		return playerOnThird;}
	
	
	
	
	
	
	
/*-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Void Methods*/	
	public void advanceRunners(boolean newPlayerOnFirst) {
		if (playerOnThird() == true) {
			playerOnThird = false;
			if ((count % 2) == 1) {
				team1 += 1;}
			else {team2 += 1;}}
		if (playerOnSecond() == true) {
			playerOnSecond = false;
			playerOnThird = true;}
		if (playerOnFirst() == true) {
			playerOnFirst = false;
			playerOnSecond = true;}
		if (newPlayerOnFirst == true) {
			playerOnFirst = true;}}
	
	
	
	

	public void pitch(int outcome) {
		if (isOver() == true) {
			outcome = 3;}
			
		if (outcome == BALL) {
			balls += 1;
			if (balls == MAX_BALLS) {
				strikes = 0;
				balls = 0;
				advanceRunners(true);
				printField();}}
		if (outcome == STRIKE) {
			strikes += 1;
			if (strikes == MAX_STRIKES) {
				strikes = 0;
				balls = 0;
				outs += 1;}}
		if (outcome == POP_FLY) {
			outs += 1;
			balls = 0;
			strikes = 0;}
		if (outcome == 3) {
			balls = 0;
			strikes = 0;
			outs = 0;}
		
		isTop();
		
		inning = (count / 2);
		if ((count % 2) == 1) {
			inning += 1;}}
	
	
	
	

	public void pitchWithHit(int numBases) {
		if (isOver() == true) {
			numBases = 5;}
		
		if (numBases == 1) {
			advanceRunners(true);}
		if (numBases == 2) {
			advanceRunners(true);
			advanceRunners(false);}
		if (numBases == 3) {
			advanceRunners(true);
			advanceRunners(false);
			advanceRunners(false);}
		if (numBases == 4) {
			advanceRunners(true);
			advanceRunners(false);
			advanceRunners(false);
			advanceRunners(false);}
		if (numBases == 5) {
			balls = 0;
			strikes = 0;
			outs = 0;}
		
		balls = 0;
		strikes = 0;
		isTop();
		
		inning = (count / 2);
		if ((count % 2) == 1) {
			inning += 1;}
		printField();}

	
	
	

	public void pitchWithHitAndOut(int numBases, int whichBaseFielded) {
		if (isOver() == true) {
			numBases = 5;
			whichBaseFielded = 5;}
			
		if (whichBaseFielded == 4) {
			if (playerOnThird == true && numBases == 1) {
				if ((count % 2) == 1) {
					team1 -= 1;}
				else {team2 -= 1;}}
			if (playerOnSecond == true && numBases == 2) {
				if ((count % 2) == 1) {
					team1 -= 1;}
				else {team2 -= 1;}}
			if (playerOnFirst == true && numBases == 3) {
				if ((count % 2) == 1) {
					team1 -= 1;}
				else {team2 -= 1;}}
			if (numBases == 4) {
				if ((count % 2) == 1) {
					team1 -= 1;}
				else {team2 -= 1;}}}
		
		if (numBases == 1) {
			advanceRunners(true);}
		if (numBases == 2) {
			advanceRunners(true);
			advanceRunners(false);}
		if (numBases == 3) {
			advanceRunners(true);
			advanceRunners(false);
			advanceRunners(false);}
		if (numBases == 4) {
			advanceRunners(true);
			advanceRunners(false);
			advanceRunners(false);
			advanceRunners(false);}
		
		if (whichBaseFielded == 1 && playerOnFirst == true) {
			playerOnFirst = false;
			outs += 1;}
		if (whichBaseFielded == 2 && playerOnSecond == true) {
			playerOnSecond = false;
			outs += 1;}
		if (whichBaseFielded == 3 && playerOnThird == true) {
			playerOnThird = false;
			outs += 1;}
		if (numBases == 5 && whichBaseFielded == 5) {
			balls = 0;
			strikes = 0;
			outs = 0;}

		balls = 0;
		strikes = 0;
		isTop();
		
		inning = (count / 2);
		if ((count % 2) == 1) {
			inning += 1;}
		printField();}
	

	
	
	
	
	
/*-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------		
Print Field*/
	 public void printField() {
		 String f_space = " ";
		int f_x = 0;
		int half = 7;
		int max = 14;
		while (f_x < (max + 1)) {
			String field1[] = new String[] {"| ", f_space, f_space, f_space, f_space, f_space, f_space, f_space, f_space, f_space, f_space, f_space, f_space, f_space," |"};
			if (f_x == half) {
				if (playerOnFirst() == true) {
					field1[max] = "X|";}
				else {
					field1[max] = "O|";}}
			if (f_x == half) {
				if (playerOnThird() == true) {
					field1[0] = "|X";}
				else {
					field1[0] = "|O";}}
			if (f_x == half) {
				if (isTop() == true) {
					field1[half] = "2";}
				else	 {
					field1[half] = "1";}}
			if (f_x == 0) {
				if (playerOnSecond() == true) {
					field1[half] = "O";}
				else {
					field1[half] = "O";}}
			if (f_x == max) {
				field1[half] = "H";}
			
			
			
			if (f_x == 0) {
				System.out.println("------------------------------|");}
			if (f_x == 1) {
				field1[half-1] = "/";
				field1[half+1] = "\\";}
			if (f_x == 2) {
				field1[half-2] = "/";
				field1[half+2] = "\\";}
			if (f_x == 3) {
				field1[half-3] = "/";
				field1[half+3] = "\\";}
			if (f_x == 4) {
				field1[half-4] = "/";
				field1[half+4] = "\\";}
			if (f_x == 5) {
				field1[half-5] = "/";
				field1[half+5] = "\\";}
			if (f_x == 6) {
				field1[half-6] = "/";
				field1[half+6] = "\\";}
			
			if (f_x == 8) {
				field1[half-6] = "\\";
				field1[half+6] = "/";}
			if (f_x == 9) {
				field1[half-5] = "\\";
				field1[half+5] = "/";}
			if (f_x == 10) {
				field1[half-4] = "\\";
				field1[half+4] = "/";}
			if (f_x == 11) {
				field1[half-3] = "\\";
				field1[half+3] = "/";}
			if (f_x == 12) {
				field1[half-2] = "\\";
				field1[half+2] = "/";}
			if (f_x == 13) {
				field1[half-1] = "\\";
				field1[half+1] = "/";}

			
			
			f_x += 1;
			String field2 = Arrays.toString(field1);
			field2 = field2.replace("]", "");
			field2 = field2.replace("[", "");
			field2 = field2.replace(",", "");
			System.out.println(field2);
			if (f_x == max + 1) {
				System.out.println("------------------------------|");}}
		System.out.println("----------------------------|");
		System.out.print(toDisplayString());
		System.out.println("----------------------------|");
		if (isOver() == true) {
			System.out.println("Thats All Folks!");}
		else {
			System.out.println();
			System.out.println();
			System.out.println();}}
	 
	 
	 
	 
	 
	 
/*-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Code From Online*/
	/*public String getBases() {
		return (playerOnFirst() ? "X" : "o") + (playerOnSecond() ? "X" : "o") +(playerOnThird() ? "X" : "o");}*/
	
	
	
	/*public Void toString() {
		String bases = getBases();
		String topOrBottom = (isTop() ? "T" : "B");
		String fmt = "%s Inning:%d (%s) Score:%d-%d Balls:%d Strikes:%d Outs:%d";
		return String.format(fmt, bases, getInning(), topOrBottom, getScore(true), getScore(false), getBalls(), getStrikes(), getOuts());}*/
	 
	 
	
	 public String toDisplayString(){
		 //String firstChar = (playerOnFirst() ? "X" : "o");
		 //String secondChar = (playerOnSecond() ? "X" : "o");
		 //String thirdChar = (playerOnThird() ? "X" : "o");
		 String topOrBottom = (isTop() ? "T" : "B");
		 String firstLine = String.format("Inning:%d (%s)                |\n", getInning(), topOrBottom);
		 String secondLine = String.format("Score:%d-%d                   |\n", getScore(true), getScore(false));
		 String thirdLine = String.format("Balls:%d Strikes:%d Outs:%d    |\n", getBalls(), getStrikes(), getOuts());
		 return firstLine + secondLine + thirdLine;}
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
}