package com.skilldistillery.cardgame;

import java.util.ArrayList;
import java.util.List;
import com.skilldistillery.cards.Card;

public abstract class Hand {
	List<Card> hand = new ArrayList<>();

	public Hand() {

	}

	public void addCard(Card card) {

	}

	public void clear() {

	}

	public void getHandValue() {

	}
	
	@Override
	public String toString() {
		return "Hand [hand=" + hand + "]";
	}
	
	

}
