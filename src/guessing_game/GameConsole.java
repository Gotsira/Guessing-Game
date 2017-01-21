package guessing_game;

import java.util.Scanner;

/**
 * Game console of guessing a secret number
 * @author Sirasath Piyapootinun
 *
 */

public class GameConsole {
	Scanner scan = new Scanner(System.in);
	private int number;
	private Game game;
	
	/**
	 * Runs the game processes step by step.
	 * @param game is the Game object called by this class
	 */
	
	public void play(Game game) {
		while(true){
			System.out.print("What is your guess? ");
			number = scan.nextInt();
			game.guess(number);
			System.out.println(game.getHint());
			if(number == game.getSecret()) {
				System.out.printf("You used %d guesses.",game.getCount());
				break;
			}
		}
	}
}
