package deckofcards;

import java.util.ArrayList;

public class Player {
	
	private ArrayList<Card> hand = new ArrayList<Card>();
	
	private int score;
	private String name;
	
	public Player(String n) {
		name = n;
	}
	
	public void drawCard(Card card) {
		hand.add(card);
	}
	
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
	
	public void displayHand() {
		if (hand.isEmpty()) {
			System.out.println("Empty Hand");
			return;
		}
		for (Card temp : hand)
			System.out.println(temp.getCardName());
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getScore() {
		return this.score;
	}
	
}
