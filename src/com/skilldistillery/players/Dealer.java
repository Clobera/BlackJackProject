package com.skilldistillery.players;

import java.util.Iterator;

import com.skilldistillery.cardgame.BlackjackHand;
import com.skilldistillery.cardgame.Hand;
import com.skilldistillery.cards.Card;
import com.skilldistillery.cards.Deck;

public class Dealer extends Player {
	private Deck deck;

	public Dealer() {
		this.deck = new Deck();
		this.deck.shuffle();
	}

	public Card dealCard(Player player) {
		Card card = deck.dealCard();
		player.receiveCard(card);
		
		return card;

	}
	
//	method show hidden hand  do not show first index of hand
	
	public void dealersHand() {
		for(int i = 1; i < this.hand.getCards().size(); i++){
			System.out.println(this.hand.getCards().get(i));
		}
	}
	public void dealersHandrevealed() {
		for(int i = 0; i < this.hand.getCards().size(); i++){
			System.out.println(this.hand.getCards().get(i));
		}
	}

}
