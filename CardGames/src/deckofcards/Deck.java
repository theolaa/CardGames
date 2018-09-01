package deckofcards;

import java.util.ArrayList;

public class Deck {
	private ArrayList<Card> cards;
	private ArrayList<Card> discardPile;
	
	public Deck (ArrayList<Card> temp) {
		cards = temp;
		 discardPile = new ArrayList<Card>();
		 shuffle();
	}
	
	public Card drawTop() {
		
		Card temp;
		
		temp = cards.get(0);
		
		cards.remove(0);
		
		return temp;
		
	}
	
	public Card drawRandom() {
		Card temp;
		
		int rand = (int)(Math.random() * ((cards.size()-1) + 1));
		
		temp = cards.get(rand);
		
		cards.remove(rand);
		
		return temp;
		
	}
	
	public void addToDiscard(Card card) {
		
		discardPile.add(card);
		
	}
	
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
	
	public void display() {
		
		for (Card temp : cards) {
			System.out.println(temp.getCardName());
		}
		System.out.println("(" + cards.size() + " cards total)");
	}
	
	public void displayDiscard() {
		
		for (Card temp : discardPile) {
			System.out.println(temp.getCardName());
		}
		System.out.println("(" + discardPile.size() + " cards total)");
	}
	
}
