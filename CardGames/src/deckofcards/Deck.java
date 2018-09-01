package deckofcards;

import java.util.ArrayList;

public class Deck {
	// Private array lists to hold the cards in the deck and in the discard pile.
	private ArrayList<Card> cards;
	private ArrayList<Card> discardPile;
	
	// A deck needs to be initialzed with an arraylist of cards.
	public Deck (ArrayList<Card> temp) {
		cards = temp;
		discardPile = new ArrayList<Card>();
		shuffle();
	}
	
	// Returns the first card in the deck. This is the "Top" of the deck for our purposes.
	public Card drawTop() {
		
		Card temp;
		
		temp = cards.get(0);
		
		cards.remove(0);
		
		return temp;
		
	}
	
	// Returns a random card from the deck. 
	public Card drawRandom() {
		Card temp;
		
		int rand = (int)(Math.random() * ((cards.size()-1) + 1));
		
		temp = cards.get(rand);
		
		cards.remove(rand);
		
		return temp;
		
	}
	
	// Adds the specified card to the discard pile.
	public void addToDiscard(Card card) {
		
		discardPile.add(card);
		
	}
	
	// Shuffles the deck, minus the discard file.
	public void shuffle() {
		ArrayList<Card> tempCards = new ArrayList<Card>();
		
		while (!cards.isEmpty()) {
			int i = (int)(Math.random() * ((cards.size()-1) + 1));
			tempCards.add(cards.get(i));
			cards.remove(i);
			//System.out.println(cards.get(i).getCardName());
		}
		
		cards = tempCards;
		
	}
	
	// Displays the cards in the deck
	public void display() {
		
		for (Card temp : cards) {
			System.out.println(temp.getCardName());
		}
		System.out.println("(" + cards.size() + " cards total)");
	}
	
	// Displays the cards in the discard pile.
	public void displayDiscard() {
		
		for (Card temp : discardPile) {
			System.out.println(temp.getCardName());
		}
		System.out.println("(" + discardPile.size() + " cards total)");
	}
	
}
