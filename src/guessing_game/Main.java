package guessing_game;

/**
 * Game of guessing a secret number.
 * @author Sirasath Piyapootinun
 *
 */

public class Main {
	static final int upperBound = 100;
	
	/*
	 * Creates the objects and starts the game.
	 */
	
	public static void main(String[] args) {
		Game game = new Game(upperBound);
		GameConsole ui = new GameConsole();
		ui.play(game);
	}
}
