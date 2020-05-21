package com.techelevator.deckOfCards;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Deck {

	private static final int DECK_COUNT = 6;
	private List<Card> listOfCards = new ArrayList<Card>();

	// constructor
	public Deck() {
	}

	// methods

	public void buildDeck() {
		for(int i = 0; i<DECK_COUNT; i++) {
		String[] suits = { "Hearts", "Diamonds", "Spades", "Clubs" };
		String[] ranks = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
			for (String suit : suits) {
				for (String rank : ranks) {
					Card currentCard = new Card(suit, rank);
					listOfCards.add(currentCard);
				}
			}
		}
	}

	public void shuffle() {
		Collections.shuffle(listOfCards);
	}

	public Card deal() {
		if (listOfCards.size() != 0) {
			return listOfCards.remove(0);
		} else {
			return null;
		}
	}
	
	public int getNumOfCards() {
		return listOfCards.size();
	}

}