import acm.program.*;
import java.util.Random;

public class SetGame extends ConsoleProgram
{
	private static final int APP_SIZE = 300;
	 Random rgen = new Random();

	public void run()
	{
		setSize(APP_SIZE, APP_SIZE);
		//creates an array for how many cards(card.java) are created
		Card[] cards = new Card[5];
		//the for loop for building them
		for(int i = 0; i < cards.length; i++)
		{
			//random generates for the arrays. they are ints becuase the array made the strings into ints
			cards[i] = new Card(rgen.nextInt(3), rgen.nextInt(3), rgen.nextInt(3), 1 + rgen.nextInt(3));
		}
		for(int i = 0; i < cards.length; i++)
		{
			//prints the cards
			println(cards[i].toString());
		}
	}
}
