package deckofcards;

public class Card {
	private int suit;
	private int value;
	
	public Card(int v, int s) {
		suit = s;
		value = v;
	}
	
	// Returns this card's suit value
	int getSuit() {
		return suit;
	}
	
	// Returns this card's numerical value
	int getValue() {
		return value;
	}
	
	// Returns true if the card is black (Spades or Clubs)
	// The suit+2 bit is to ensure no dividing by zero occurs, as Spades are denoted by a 0.
	public boolean isBlack() {
		if ((suit+2) % 2 == 0) return true;
		return false;
	}
	
	// Returns true if card is of the same suit and value as this card.
	public boolean equals(Card card) {
		if ((this.value == card.value) && (this.suit == card.suit)) return true;
		return false;
	}
	
	// Returns true if card is of the same suit as this card
	public boolean equalsSuit (Card card) {
		if (this.suit == card.suit) return true;
		return false;
	}
	
	// Returns true if card is of the same value as this card
	public boolean equalsValue(Card card) {
		if (this.value == card.value) return true;
		return false;
	}
	
	// Returns this card's value and suit in a human-friendly format
	String getCardName() {
		String tempSuit;
		String tempValue;
		
		// Gets the card's suit
		switch (this.getSuit()) {
			case 0: tempSuit = "Spades"; break;
			case 1: tempSuit = "Hearts"; break;
			case 2: tempSuit = "Clubs"; break;
			case 3: tempSuit = "Diamonds"; break;
			default: tempSuit = "Unknown";
		}
		
		// Gets the card's value
		switch (this.getValue()) {
			case 1: tempValue = "Ace"; break;
			case 2: tempValue = "Two"; break;
			case 3: tempValue = "Three"; break;
			case 4: tempValue = "Four"; break;
			case 5: tempValue = "Five"; break;
			case 6: tempValue = "Six"; break;
			case 7: tempValue = "Seven"; break;
			case 8: tempValue = "Eight"; break;
			case 9: tempValue = "Nine"; break;
			case 10: tempValue = "Ten"; break;
			case 11: tempValue = "Jack"; break;
			case 12: tempValue = "Queen"; break;
			case 13: tempValue = "King"; break;
			default: tempValue = "Unknown";
		}
		
		return new String(tempValue + " of " + tempSuit);
		
	}
	
}
