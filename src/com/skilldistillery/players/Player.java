package com.skilldistillery.players;

import com.skilldistillery.cardgame.BlackjackHand;
import com.skilldistillery.cardgame.Hand;
import com.skilldistillery.cards.Card;

public class Player {
	protected Hand hand;

	public Player() {
		hand = new BlackjackHand();
	}

	// make recieve card method
	public void receiveCard(Card card1) {
		hand.addCard(card1);
		
	}

	public void showHand() {
		hand.displayHand();
		System.out.println();
		
	
	}
	
	public int getHandValue() {
		return hand.getHandValue();
	}

}
