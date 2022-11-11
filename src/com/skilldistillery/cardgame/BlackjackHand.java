package com.skilldistillery.cardgame;

import com.skilldistillery.cards.Card;

public class BlackjackHand extends Hand {

	public BlackjackHand() {
		super();
	}

	public int getHandValue(Card a, Card b) {
		int handValue = a.getValue() + b.getValue();
		
		return handValue;
	}

	public boolean isBlackJack() {

		return false;
	}

	public boolean isBust() {

		return false;
	}

}
