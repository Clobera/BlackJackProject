package com.skilldistillery.cardgame;

import java.util.ArrayList;
import java.util.List;
import com.skilldistillery.cards.Card;

public abstract class Hand {

	List<Card> cards = new ArrayList<>();

	public Hand() {

	}

	public void addCard(Card card) {
		cards.add(card);
	}

	public void clear() {

	}

	public int getHandValue() {

		int value = 0;
		for (Card card : cards) {
			value += card.getValue();
		}
		return value;
	}

	public void displayHand() {
		for (Card card : cards) {
			System.out.println(card);
		}

	}

	public List<Card> getCards() {
		return cards;
	}

	public void setCards(List<Card> cards) {
		this.cards = cards;
	}

	@Override
	public String toString() {
		return "Hand [hand=" + cards + "]";
	}

}
