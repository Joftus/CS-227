package Question1;
import java.util.ArrayList;
import java.util.Random;

// Joshua Loftus ComSci 227 Section A
public class RandomPlayer implements IPlayer
	{
	
	private Random rand = new Random();
	private ArrayList<Integer> history = new ArrayList<Integer>();
	
	
	
	public int play()
		{
		int move = rand.nextInt(3); // randomly chooses 0, 1, or 2
		history.add(move);
		return move;
		}
		
		
		
	public int getPreviousMove(int movesAgo)
		{
		return history.get(history.size() - movesAgo);
		}
		
		
		
	protected int nextRandom(int n)
		{
		return rand.nextInt(n);
		}
		
		
		
	protected void addToHistory(int move)
		{
		history.add(move);
		}
	}
