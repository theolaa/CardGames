package deckofcards;

import java.util.ArrayList;

public class Player {
	
	// The Player's hand of cards
	private ArrayList<Card> hand = new ArrayList<Card>();
	
	// Players score (may be unused)
	private int score;
	
	// Player's display name
	private String name;
	
	// Constructor for player object with name.
	public Player(String n) {
		name = n;
	}
	
	// Adds the specified card to the player's hand
	public void drawCard(Card card) {
		hand.add(card);
	}
	
	// Searches the player's hand for a specific card, and removes it if it is found.
	// That card is then passed back to where it was called to be placed in a discard pile or otherwise dealt with.
	// Returns null if no matching card was found.
	public Card discardCard(int val, int suit) {
		Card cardToDiscard = new Card(val,suit);
		for (Card card : hand) {
			if (card.equals(cardToDiscard)) {
				Card temp = card;
				hand.remove(card);
				return temp;
			}
		}
		return null;
	}
	
	// Displays the cards in the player's hand
	public void displayHand() {
		if (hand.isEmpty()) {
			System.out.println("Empty Hand");
			return;
		}
		for (Card temp : hand)
			System.out.println(temp.getCardName());
		System.out.println("("+ hand.size() + " cards total)");
	}
	
	// Gets the player's name
	public String getName() {
		return this.name;
	}
	
	// Gets the player's score
	public int getScore() {
		return this.score;
	}
	
}
