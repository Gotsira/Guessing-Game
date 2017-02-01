package guessinggame;

import java.util.Scanner;

/**
 * Game console of guessing a secret number
 * @author Sirasath Piyapootinun
 *
 */

public class GameConsole {
	
	/**
	 * Runs the game processes step by step.
	 * @param game is the Game object called by this class
	 */
	
	public int play(Game game) {
		Scanner scan = new Scanner(System.in);
		int number = 0;
		System.out.print(game.getHint());
		while(true){
			System.out.print("What is your guess? ");
			number = scan.nextInt();
			if(game.guess(number)) {
				System.out.println(game.getHint());
				System.out.printf("You used %d guesses.",game.getCount());
				break;
			}
			System.out.println(game.getHint());
		}
		return number;
	}
}
