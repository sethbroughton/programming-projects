package com.techelevator.deckOfCards;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class CardDAO {
	
	public CardDAO(){
		
	}

	public List<Card> listAllCards() {
		
		List<Card> myDeck = new ArrayList<>();
		String[] suits = new String[] {"Hearts","Spades","Diamonds","Clubs"};
		String[] values = new String[] {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
		
		for(String suit : suits) {
			for(String value : values) {
				Card myCard = new Card();
				myCard.setSuit(suit);
				myCard.setValue(value);
				myDeck.add(myCard);
			}
		}
		
		return myDeck;
	}
	
	public List<Card> shuffle(){
		Random randomNumber = new Random();
		List<Card> deck = listAllCards();
		
		int sizeOfDeck = deck.size();
		
		for(int i = sizeOfDeck-1; i>=1; i--) {
		//random number generator from 0 to i;
			int swapIndex = randomNumber.nextInt(i);	
		
		//Swap cards
			Card temp = deck.get(i);
			deck.set(i, deck.get(swapIndex));
			deck.set(swapIndex, temp);
		}
		
		return deck;	
	}
	
}
