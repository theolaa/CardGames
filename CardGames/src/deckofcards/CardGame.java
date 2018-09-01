package deckofcards;

import java.util.ArrayList;

public abstract class CardGame {

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
