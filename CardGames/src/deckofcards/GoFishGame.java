package deckofcards;
	
public class GoFishGame extends CardGame{
	
	Deck deck = new Deck(buildDeck(1));
	
	public void setup() {
		deck.display();
	}
	
}
