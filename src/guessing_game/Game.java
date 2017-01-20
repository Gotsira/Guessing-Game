package guessing_game;

import java.util.Random;
/**
 * Game of guessing a secret number
 * @author Sirasath Piyapootinun
 *
 */

public class Game {
	private int upperBound;
	private int secret;
	private String hint;
	private int count = 0;
	/**
	 * Initialize a new game
	 * @param upperBound is the max value for the secret number (>1)
	 */
	public Game(int upperBound) {
		this.upperBound = upperBound;
		secret = getRandomNumber(upperBound);
		System.out.printf("I'm thinking of a number between 1 and %d.\n", upperBound);	
	}
	/**
	 * Create a random number between 1 and limit
	 * @param limit is the upper limit for random number
	 * @return a random number between 1 and limit
	 */
	private int getRandomNumber(int limit){
		Random rand = new Random();
		return rand.nextInt(limit) + 1;
	}
	/**
	 * Checks if the number is equal to the answer or not.
	 * @param number is the number that you have guessed
	 * @return Is ans equals to number?
	 */
	public boolean guess(int number){
		if(number == secret){
			setHint(String.format("Correct. The secret is %d", secret));
			count++;
			return true;
		}
		else if(number < secret){
			setHint("Sorry, your guess is too small.");
			count++;
			return false;
		}
		else{
			setHint("Sorry, your guess is too large");
			count++;
			return false;
		}
	}
	/**
	 * Return a hint based on the most recent guess.
	 * @return hint based on the most recent guess
	 */
	public String getHint() {
		return hint;
	}
	/**
	 * Set hint for the answer
	 * @param hint to be set
	 */
	protected void setHint(String hint) {
		this.hint = hint;
	}
	/**
	 * Return the secret number.
	 * @return secret number
	 */
	public int getSecret() {
		return secret;
	}
	/**
	 * Return the number of guesses.
	 * @return the number of guesses
	 */
	public int getCount(){
		return count;
	}
}

