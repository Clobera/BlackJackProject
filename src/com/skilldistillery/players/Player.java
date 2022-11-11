package com.skilldistillery.players;

import com.skilldistillery.cardgame.BlackjackHand;
import com.skilldistillery.cardgame.Hand;
import com.skilldistillery.cards.Card;

public class Player {
	private Hand hand;
	
	public Player() {
		hand = new BlackjackHand();
	}
	
	//make recieve card method
	public void receiveCard(Card card) {
		hand.addCard(card);
	}
	
	

}
