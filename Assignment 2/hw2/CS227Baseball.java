package hw2;

/*Joshua 
Loftus
ComSci 227
Section A*/

public class CS227Baseball {
/*-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------	
Non-Private Global Variables*/
	
	
	
	/*
	 * Constant indicating that a pitch results in a strike.
	 */
	public static final int STRIKE = 1;
	/*
	 * Constant indicating that a pitch results in a ball.
	 */
	public static final int BALL = 0;
	/*
	 * Constant indicating that a pitch results in an out from a fly ball.
	 */
	public static final int POP_FLY = 2;
	/*
	 * Number of balls causing a player to walk.
	 */
	public static final int MAX_BALLS = 4;
	/*
	 * Number of outs before the teams switch.
	 */
	public static final int MAX_OUTS = 3;
	/*
	 * Number of strikes causing a player to be out.
	 */
	public static final int MAX_STRIKES = 3;
	
	


	
/*-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Private Global Variables*/
	
	
	
	/*
	 * What inning it is.
	 */
	private int inning;
	/*
	 * What team is up to bat.
	 */
	private int team;
	/*
	 * How many innings will be played.
	 */
	private int numInnings;
	/*
	 * The team that bats in the top of the inning.
	 */
	private int team1;
	/*
	 * The team that bats in the bottom of the inning.
	 */
	private int team2;
	/*
	 * Number of outs for the team at bat.
	 */
	private int outs;
	/*
	 * Number of strikes for the team at bat.
	 */
	private int strikes;
	/*
	 * Number of balls for the team at bat.
	 */
	private int balls;
	/*
	 * The tracker for if it is the top or bottom of the inning.
	 */
	private int count = 1;
	/*
	 * True if their is a player on first base.
	 */
	private boolean playerOnFirst = false;
	/*
	 * True if their is a player on first base.
	 */
	private boolean playerOnSecond = false;
	/*
	 * True if their is a player on first base.
	 */
	private boolean playerOnThird = false;
	
	
	
	
	
/*-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Constructor*/
	
	
	
	/*
	 * Constructs a game that has the given number of 
	 * innings and starts at the top of inning 1.
	 * @param
	 */
	public CS227Baseball(int givenNumInnings) {
		numInnings = givenNumInnings;}
	
	

	
	
/*-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------	
Int Methods*/	
	
	
	
	/*
	 * Returns the number of balls for the current batter.
	 * @return
	 */
	public int getBalls() {
		return balls;}
	
	
	
	/*
	 * Returns the number of strikes for the current batter.
	 * @return
	 */
	public int getStrikes() {
		return strikes;}
	
	
	
	/*
	 * Returns the number of outs for the current batter.
	 * @return
	 */
	public int getOuts() {
		return outs;}
	
	
	
	/*
	 * Returns the current inning.
	 * @return
	 */
	public int getInning() {
		inning = (count / 2);
		if ((count % 2) == 1) {
			inning += 1;}
		if (isOver() == true) {
			inning = ((count / 2) + 1);}
		return inning;}
	
	
	
	/*
	 * Returns the score of the indicated team, 
	 * where an argument of true indicates team 0 
	 * (batting in the top of the inning) and an argument of 
	 * false indicates team 1 (batting in the bottom of the inning).
	 * @param
	 * @return
	 */
	public int getScore(boolean team0) {
		if (team0 == true) {
			team = team1;}
		else {team = team2;}
		return team;}
	
	
	
	

	
	
/*-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------	
Boolean Methods*/
	
	
	
	/*
	 * Returns true if the game is over, false otherwise.
	 * @return
	 */
	public boolean isOver() {
		if (inning == (numInnings)) {
			outs = 0;
			return true;}
		else {return false;}}
	
	
	
	/*
	 * Returns true if it's the first half of the inning (team 0 is at bat).
	 * @return
	 */
	public boolean isTop() {
		if (outs == 3) {
			count += 1;
			playerOnFirst = false;
			playerOnSecond = false;
			playerOnThird = false;
			outs = 0;}
		if (count == (numInnings * 2)) {
			return true;}
		if ((count % 2) == 1) {
			return true;}
		else {return false;}}
	
	
	
	/*
	 * Returns whether there is a player on first base.
	 * @return
	 */
	public boolean playerOnFirst() {
		return playerOnFirst;}
	
	
	
	/*
	 * Returns whether there is a player on second base.
	 * @return
	 */
	public boolean playerOnSecond() {
		return playerOnSecond;}
	
	
	
	/*
	 * Returns whether there is a player on third base.
	 * @return
	 */
	public boolean playerOnThird() {
		return playerOnThird;}
	
	
	
	
	
/*-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Void Methods*/	
	
	
	
	/*
	 * Advances all players on base by one base, updating the score 
	 * if there is currently a player on third.
	 * @param
	 */
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
	
	
	
	/*
	 * Pitch not resulting in a hit.
	 * @param
	 */
	public void pitch(int outcome) {
		if (outcome == BALL) {
			balls += 1;
			if (balls == MAX_BALLS) {
				strikes = 0;
				balls = 0;
				advanceRunners(true);}}
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
		if (outs == 3)
		if (isTop() == true) {
			isTop();}
		if (isTop() == false) {
			isTop();}}
	
	
	
	/*
	 * Pitch resulting in a hit where no player is out.
	 * @param
	 */
	public void pitchWithHit(int numBases) {
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
		balls = 0;
		strikes = 0;
		if (isTop() == true) {
			isTop();}
		if (isTop() == false) {
			isTop();}}

	
	
	/*
	 * Pitch resulting in a hit and a possible out.
	 * @param
	 */
	public void pitchWithHitAndOut(int numBases, int whichBaseFielded) {
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
		balls = 0;
		strikes = 0;
		if (isTop() == true) {
			isTop();}
		if (isTop() == false) {
			isTop();}}
	
	
	
	
	
/*-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------		
Code From Online*/
	
	
	
	/*
	 * Returns a three-character string representing the players on base, 
	 * in the order first, second, and third, where 'X' indicates a player 
	 * is present and 'o' indicates no player.
	 * @return
	 */
	public String getBases() {
		return (playerOnFirst() ? "X" : "o") + (playerOnSecond() ? "X" : "o") +(playerOnThird() ? "X" : "o");}
	
	
	
	/*
	 * Returns a one-line string representation of the current game state.
	 * @return
	 */
	public String toString() {
		String bases = getBases();
		String topOrBottom = (isTop() ? "T" : "B");
		String fmt = "%s Inning:%d (%s) Score:%d-%d Balls:%d Strikes:%d Outs:%d";
		return String.format(fmt, bases, getInning(), topOrBottom, getScore(true), getScore(false), getBalls(), getStrikes(), getOuts());}
	 
	 
	 
	/*
	 * Returns a multi-line string representation of the current game state.
	 * @return
	 */
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