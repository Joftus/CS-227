package hw2;

/*Joshua 
Loftus
ComSci 227
Section A*/

import hw2.CS227BaseballClean;

public class hw2Test {
	public static void main(String[] args) {
		CS227BaseballClean game = new CS227BaseballClean(2);
		
		game.pitchWithHit(3);
		game.pitch(CS227Baseball.POP_FLY);
		game.pitch(CS227Baseball.POP_FLY);
		game.pitch(CS227Baseball.POP_FLY);
		game.pitchWithHit(4);
		game.pitchWithHit(1);
		game.pitchWithHit(2);
		game.pitch(CS227Baseball.STRIKE);
		game.pitch(CS227Baseball.STRIKE);
		game.pitchWithHitAndOut(2, 1);
		game.pitch(CS227Baseball.STRIKE);
		game.pitch(CS227Baseball.STRIKE);
		game.pitch(CS227Baseball.STRIKE);
		game.pitchWithHitAndOut(2, 2);
		game.pitchWithHit(3);
		game.pitch(CS227Baseball.BALL);
		game.pitch(CS227Baseball.BALL);
		game.pitch(CS227Baseball.STRIKE);
		game.pitch(CS227Baseball.BALL);
		game.pitch(CS227Baseball.BALL);
		game.pitchWithHitAndOut(3, 3);
		//game.pitchWithHit(4);
		//game.pitchWithHit(4);
		

		/*game.pitch(CS227Baseball.STRIKE);
		game.pitch(CS227Baseball.BALL);
		game.pitch(CS227Baseball.BALL);
		game.pitch(CS227Baseball.BALL);
		game.pitch(CS227Baseball.STRIKE);
		game.pitchWithHit(1);
		game.pitchWithHit(1);
		game.pitch(CS227Baseball.POP_FLY);
		game.pitchWithHitAndOut(4, 4);
		game.pitch(CS227Baseball.STRIKE);
		game.pitch(CS227Baseball.BALL);
		game.pitch(CS227Baseball.BALL);
		game.pitch(CS227Baseball.BALL);
		game.pitch(CS227Baseball.BALL);
		game.pitch(CS227Baseball.STRIKE);
		game.pitch(CS227Baseball.STRIKE);
		game.pitch(CS227Baseball.STRIKE);
		game.pitch(CS227Baseball.POP_FLY);
		game.pitchWithHit(2);
		game.pitchWithHitAndOut(2, 1);
		game.pitch(CS227Baseball.STRIKE);*/
		//game.pitch(CS227Baseball.STRIKE);
		//game.pitch(CS227Baseball.BALL);
		//game.pitch(CS227Baseball.BALL);
		//game.pitch(CS227Baseball.STRIKE);
		//game.pitchWithHitAndOut(2, 2);
		
		/*Should have:
		ooo Inning:3 (T) Score:3-8 Balls:0 Strikes:0 Outs:0*/

		
		//game.pitch(CS227Baseball.POP_FLY);
		//game.pitchWithHit(1);
	
}}