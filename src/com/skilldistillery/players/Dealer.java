package com.skilldistillery.players;

import com.skilldistillery.cardgame.BlackjackHand;
import com.skilldistillery.cardgame.Hand;
import com.skilldistillery.cards.Card;
import com.skilldistillery.cards.Deck;

public class Dealer {
	private Deck deck;
	private Hand hand;
	
	public Dealer() {
	this.deck = new Deck();
	this.hand = new BlackjackHand();
	}

	public void dealCard(Player player) {

		Card card = deck.dealCard();
		player.receiveCard(card);

	}

}
