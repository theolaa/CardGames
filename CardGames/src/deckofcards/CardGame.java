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

}
