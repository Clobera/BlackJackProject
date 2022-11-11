package com.skilldistillery.cards;

public enum Suit {
	
	HEARTS("Hearts"), SPADES("Spades"), CLUBS("Clubs"), DIAMONDS("Diamonds");
	
	private String name;
	
	Suit(final String name) { 
		this.name = name;
	}
	
	@Override
	public String toString() {
		return this.name;
	}
	
}
