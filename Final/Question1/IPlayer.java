package Question1;
// Joshua Loftus ComSci 227 Section A
interface IPlayer
	{
	
	int play(); // Returns the player's move, which is always 0, 1, or 2
	
	
	
	int getPreviousMove(int movesAgo); // Returns a previous move
	}
