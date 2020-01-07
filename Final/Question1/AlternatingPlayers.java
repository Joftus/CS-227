package Question1;

// Joshua Loftus ComSci 227 Section A
public class AlternatingPlayers extends RandomPlayer
	{
	
	private int state = 0;
	
	
	
	public int play()
		{
		// usually returns 0, but every third move randomly chooses 1 or 2
		int move = 0;
		if (state % 3 == 2)
			{
			move = nextRandom(2) + 1;
			}
		++state;
		addToHistory(move);
		return move;
		}
	}
