package hw2;

/*Joshua 
Loftus
ComSci 227
Section A*/

public class CS227BaseballTry1 {
/*-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------	
Non-Private Global Variables*/
	static int STRIKE = 1;
	static int BALL = 0;
	static int POP_FLY = 2;
	static int MAX_BALLS = 4;
	static int MAX_OUTS = 3;
	static int MAX_STRIKES = 3;
	
	


	
/*-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Private Global Variables*/
	private int inning;
	private int team;
	private int numInnings;
	private int team1;
	private int team2;
	private int score;
	private int outs;
	private int strikes;
	private int balls;
	private int player1 = 0;
	private int player2 = 0;
	private int player3 = 0;
	private int player4 = 0;
	private int count = 1;
	
	
	
	
	
/*-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Constructor*/
	@SuppressWarnings("unused")
	CS227BaseballTry1(int givenNumInnings) {
		int numInnings = givenNumInnings;}
	
	

	
	
/*-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------	
Int Methods*/	
	public int getBalls() {
		return balls;}
	
	
	
	public int getStrikes() {
		return strikes;}
	
	
	
	public int getOuts() {
		return outs;}
	
	
	
	public int getInning() {
		inning = (count / 2);
		return inning;}
	
	
	
	public int getScore(boolean team0) {
		if (team0 = true) {
			team = team1;
			score = team;}
		else {
			team = team2;
			score = team;}
		return score;}
	
	
	
	

	
	
/*-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------	
Boolean Methods*/		
	public boolean isOver() {
		if (inning == (numInnings + 1)) {
			return true;}
		else {
			return false;}}
	
	
	
	public boolean isTop() {
		if (outs >= 3) {
			count += 1;
			outs = 0;}
		if ((count % 2) == 1) {
			return true;}
		else {
			return false;}}
	
	
	
	public boolean playerOnFirst() {
		if (player1 == 1 || player2 == 1) {
			return true;}
		else {
			return false;}}
	
	
	
	public boolean playerOnSecond() {
		if (player1 == 2 || player2 == 2 || player3 == 2) {
			return true;}
		else {
			return false;}}
	
	
	
	public boolean playerOnThird() {
		if (player1 == 3 || player2 == 3 || player3 == 3 || player4 == 3) {
			return true;}
		else {
			return false;}}
	
	
	
	
	
/*-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Void Methods*/	
	//public void advanceRunners(boolean newPlayerOnFirst) {
	
	
	
	public void pitch(int outcome) {
		if (outcome == 0) {
			balls += 1;
			if (balls == 4) {
				strikes = 0;
				balls = 0;
				player1 = 1;
				if (player2 > 0) {
					player2 += 1;}
				if (player3 > 0) {
					player3 += 1;}
				if (player4 > 0) {
					player4 += 0;}}}
		if (outcome == 1) {
			strikes += 1;
			if (strikes == 3) {
				strikes = 0;
				balls = 0;
				outs += 1;}}
		if (outcome == 2) {
			outs += 1;}}
	
	
	
	public void pitchWithHit(int numBases) {
		player3 = player4;
		player2 = player3;
		player1 = player2;
		player1 = 0;
		if (numBases == 1) {
			player1 = 1;
			if (player2 > 0) {
				player2 += 1;}
			if (player3 > 0) {
				player3 += 1;}
			if (player4 > 0) {
				player4 = 4;}}
		if (numBases == 2) {
			player1 = 2;
			if (player2 > 0) {
				player2 = 3;}
			if (player3 > 0) {
				player3 = 4;}
			if (player4 > 0) {
				player4 = 4;}}
		if (numBases == 3) {
			player1 = 3;
			if (player2 > 0) {
				player2 = 4;}
			if (player3 > 0) {
				player3 = 4;}
			if (player4 > 0) {
				player4 = 4;}}
		if (numBases == 4) {
			player1 = 4;
			if (player2 > 0) {
				player2 = 4;}
			if (player3 > 0) {
				player3 = 4;}
			if (player4 > 0) {
				player4 = 4;}}
		if (player1 == 4 || player2 == 4 || player3 == 4 || player4 == 4) {
			if (player1 == 4) {
				if ((count % 2) == 1) {
					team1 += 1;
					player1 = 0;}
				else {
					team2 += 1;
					player1 = 0;}}
			if (player2 == 4) {
				if ((count % 2) == 1) {
					team1 += 1;
					player2 = 0;}
				else {
					team2 += 1;
					player2 = 0;}}
			if (player3 == 4) {
				if ((count % 2) == 1) {
					team1 += 1;
					player3 = 0;}
				else {
					team2 += 1;
					player3 = 0;}}
			if (player4 == 4) {
				if ((count % 2) == 1) {
					team1 += 1;
					player4 = 0;}
				else {
					team2 += 1;
					player4 = 0;}}}
		if (player1 == 0 || player2 == 0 || player3 == 0) {
			if (player1 == 0) {
				player4 = player3;
				player3 = player2;
				player2 = player1;}
			if (player2 == 0) {
				player4 = player3;
				player3 = player2;}
			if (player3 == 0) {
				player4 = player3;}}}

	
	
	public void pitchWithHitAndOut(int numBases, int whichBaseFielded) {
		player3 = player4;
		player2 = player3;
		player1 = player2;
		player1 = 0;
		if (numBases == 1) {
			player1 = 1;
			if (player2 > 0) {
				player2 += 1;}
			if (player3 > 0) {
				player3 += 1;}
			if (player4 > 0) {
				player4 = 4;}}
		if (numBases == 2) {
			player1 = 2;
			if (player2 > 0) {
				player2 = 3;}
			if (player3 > 0) {
				player3 = 4;}
			if (player4 > 0) {
				player4 = 4;}}
		if (numBases == 3) {
			player1 = 3;
			if (player2 > 0) {
				player2 = 4;}
			if (player3 > 0) {
				player3 = 4;}
			if (player4 > 0) {
				player4 = 4;}}
		if (numBases == 4) {
			player1 = 4;
			if (player2 > 0) {
				player2 = 4;}
			if (player3 > 0) {
				player3 = 4;}
			if (player4 > 0) {
				player4 = 4;}}
		if (whichBaseFielded == 1) {
			player1 = 0;}
		if (whichBaseFielded == 2) {
			player2 = 0;}
		if (whichBaseFielded == 3) {
			player3 = 0;}
		if (whichBaseFielded == 4) {
			player4 = 0;}
		if (player1 == 4 || player2 == 4 || player3 == 4 || player4 == 4) {
			if (player1 == 4) {
				if ((count % 2) == 1) {
					team1 += 1;
					player1 = 0;}
				else {
					team2 += 1;
					player1 = 0;}}
			if (player2 == 4) {
				if ((count % 2) == 1) {
					team1 += 1;
					player2 = 0;}
				else {
					team2 += 1;
					player2 = 0;}}
			if (player3 == 4) {
				if ((count % 2) == 1) {
					team1 += 1;
					player3 = 0;}
				else {
					team2 += 1;
					player3 = 0;}}
			if (player4 == 4) {
				if ((count % 2) == 1) {
					team1 += 1;
					player4 = 0;}
				else {
					team2 += 1;
					player4 = 0;}}}
		if (player1 == 0 || player2 == 0 || player3 == 0) {
			if (player1 == 0) {
				player4 = player3;
				player3 = player2;
				player2 = player1;}
			if (player2 == 0) {
				player4 = player3;
				player3 = player2;}
			if (player3 == 0) {
				player4 = player3;}}}
	
	
	
	
	
/*-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------		
Code From Online*/	  
	public String getBases() {
		return (playerOnFirst() ? "X" : "o") + (playerOnSecond() ? "X" : "o") +(playerOnThird() ? "X" : "o");}
	
	
	
	public String toString() {
		String bases = getBases();
		String topOrBottom = (isTop() ? "T" : "B");
		String fmt = "%s Inning:%d (%s) Score:%d-%d Balls:%d Strikes:%d Outs:%d";
		return String.format(fmt, bases, getInning(), topOrBottom, getScore(true), getScore(false), getBalls(), getStrikes(), getOuts());}
	 
	 
	 
	 public String toDisplayString(){
		 String firstChar = (playerOnFirst() ? "X" : "o");
		 String secondChar = (playerOnSecond() ? "X" : "o");
		 String thirdChar = (playerOnThird() ? "X" : "o");
		 String topOrBottom = (isTop() ? "T" : "B");
		 String firstLine = String.format("%s - %s    Inning:%d (%s)\n", secondChar, firstChar, getInning(), topOrBottom);
		 String secondLine = String.format("|   |    Score:%d-%d\n", getScore(true), getScore(false));
		 String thirdLine = String.format("%s - H    Balls:%d Strikes:%d Outs:%d\n", thirdChar, getBalls(), getStrikes(), getOuts());
		 return firstLine + secondLine + thirdLine;}  
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
}
