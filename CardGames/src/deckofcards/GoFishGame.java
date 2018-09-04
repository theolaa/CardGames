package deckofcards;

import java.util.ArrayList;

public class GoFishGame extends CardGame {
	
	Deck deck = new Deck(buildDeck(1));
	
	ArrayList<Player> players = new ArrayList<Player>();
	
	public void setup() {
		
		// Get number of players and instantiate them here
		players.add(new Player("Player 1"));
		players.add(new Player("Player 2"));
		
		int startingHandSize = 7;
		
		if (players.size() > 3) startingHandSize = 5;
		
		for (int i = 0; i <startingHandSize; i++) {
			for(Player temp : players) {
				temp.drawCard(deck.drawTop());
			}
		}
		
		displayGameState(deck, players);
		
	}
	
}
