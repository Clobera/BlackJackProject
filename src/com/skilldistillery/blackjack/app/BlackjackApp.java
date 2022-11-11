package com.skilldistillery.blackjack.app;

import com.skilldistillery.players.Dealer;
import com.skilldistillery.players.Player;

public class BlackjackApp {

	public static void main(String[] args) {
		BlackjackApp ba = new BlackjackApp();
		
		
		ba.run();

	}
	
	private void run() {
		Dealer dealer = new Dealer();
		Player player = new Player();
		
		dealer.dealCard(player);
		dealer.dealCard(dealer);
		dealer.dealCard(player);
		dealer.dealCard(dealer);
		
	}
	

}
