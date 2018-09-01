package deckofcards;

import java.util.ArrayList;

// A "template" of sorts for all different kinds of card games. 
// Should hold some features that are pretty much universal to all card games.
public abstract class CardGame {

	// Generates an arraylist of playing cards to instantiate a deck with.
	// Can have more than one standard playing deck's worth of cards.
	public ArrayList<Card> buildDeck(int noOfDecks) {
		if (noOfDecks < 1)
			noOfDecks = 1;

		ArrayList<Card> tempCards = new ArrayList<Card>();

		for (int deckNo = 0; deckNo < noOfDecks; deckNo++) {

			for (int cardVal = 1; cardVal < 14; cardVal++) {

				for (int cardSuit = 0; cardSuit < 4; cardSuit++) {

					tempCards.add(new Card(cardVal, cardSuit));

					// System.out.println(cardVal + " of " + cardSuit);

				}

			}

		}

		return tempCards;

	}
	
	// Displays all players' hands, the deck, and the discard pile.
	public void displayGameState(Deck deck, ArrayList<Player> players) {
		
		for (Player temp : players) {
			System.out.println(temp.getName());
			temp.displayHand();
			System.out.println("");
		}
		
		System.out.println("Deck:");
		deck.display();
		System.out.println("");
		
		System.out.println("Discard:");
		deck.displayDiscard();
		System.out.println("");
		
	}

}
