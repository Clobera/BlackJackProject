package com.skilldistillery.cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	private List<Card> deck = new ArrayList<>();

	public Deck() {
		Suit [] suits = Suit.values();
		Rank [] ranks = Rank.values();
		
		for (Suit suit : suits) {
			for (Rank rank : ranks) {
				Card aCard = new Card(suit, rank);
				deck.add(aCard);
			}
		}
		
	}
	

	public void shuffle() {
		Collections.shuffle(deck);
	}
	

	public int checkDeckSize() {
		return deck.size();
	}
	

	public Card dealCard() {
		return deck.remove(0);
	}
	

}
