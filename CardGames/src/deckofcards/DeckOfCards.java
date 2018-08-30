package deckofcards;

import java.util.ArrayList;

public class DeckOfCards {
	
	public static void main(String[] args) {
		
		new GameWindow();
		
		GoFishGame game = new GoFishGame();
		
		game.setup();
		
	}
	
}
