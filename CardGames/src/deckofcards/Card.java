package deckofcards;

public class Card {
	private int suit;
	private int value;
	
	public Card(int v, int s) {
		suit = s;
		value = v;
	}
	
	int getSuit() {
		return suit;
	}
	
	int getValue() {
		return value;
	}
	
	public boolean equals(Card card) {
		if ((this.value == card.value) && (this.suit == card.suit)) return true;
		return false;
	}
	
	public boolean equalsSuit (Card card) {
		if (this.suit == card.suit) return true;
		return false;
	}
	
	public boolean equalsValue(Card card) {
		if (this.value == card.value) return true;
		return false;
	}
	
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
