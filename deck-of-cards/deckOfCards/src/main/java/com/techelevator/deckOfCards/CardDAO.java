package com.techelevator.deckOfCards;

import java.util.ArrayList;
import java.util.List;

public class CardDAO {

	public static List<Card> listAllCards() {
		
		List<Card> myDeck = new ArrayList<>();
		String[] suits = new String[] {"Hearts","Spades","Diamonds","Clubs"};
		String[] values = new String[] {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
		
		for(String suit : suits) {
			for(String value : values) {
				myDeck.add(new Card(suit, value));
			}
		}
		
		return myDeck;
	}
	
	
}
