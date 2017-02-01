package guessinggame;

import java.util.Random;

/**
 * Game of guessing a secret number.
 * @author Sirasath Piyapootinun
 *
 */

public class Game {
	private int upperBound;
	private int secret;
	private String hint;
	private int count;
	
	/**
	 * Initialize a new game
	 * @param upperBound is the max value for the secret number (>1)
	 */
	
	public Game(int upperBound) {
		this.upperBound = upperBound;
		secret = getRandomNumber(upperBound);
		setHint(String.format("I'm thinking of a number between 1 and %d.\n", upperBound));	
		count = 0;
	}
	
	/**
	 * Create a random number between 1 and limit
	 * @param limit is the upper limit for random number
	 * @return a random number between 1 and limit
	 */
	
	private int getRandomNumber(int limit) {
		Random rand = new Random();
		return rand.nextInt(limit) + 1;
	}
	
	/**
	 * Checks if the number is equal to the answer or not.
	 * @param number is the number that you have guessed.
	 * @return Is ans equals to number?
	 */
	
	public boolean guess(int number) {
		count++;
		if(number == secret){
			setHint(String.format("Correct. The secret is %d", secret));
			return true;
		}
		else if(number < secret){
			setHint("Sorry, your guess is too small.");
			return false;
		}
		else{
			setHint("Sorry, your guess is too large");
			return false;
		}
	}
	
	/**
	 * Return a hint based on the most recent guess.
	 * @return hint based on the most recent guess.
	 */
	
	public String getHint() {
		return hint;
	}
	
	/**
	 * Set hint for the answer
	 * @param hint is the hint for the secret number.
	 */
	
	protected void setHint(String hint) {
		this.hint = hint;
	}
	
	/**
	 * Return the number of guesses.
	 * @return the number of guesses
	 */
	
	public int getCount() {
		return count;
	}
}

