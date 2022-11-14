package com.skilldistillery.blackjack.app;

import java.util.Scanner;

import com.skilldistillery.players.Dealer;
import com.skilldistillery.players.Player;

public class BlackjackApp {
	Scanner sc = new Scanner(System.in);
	Dealer dealer = new Dealer();
	Player player = new Player();

	public static void main(String[] args) {
		BlackjackApp ba = new BlackjackApp();
		boolean keepPlaying = true;

		ba.run();
	}

	private void run() {
		boolean keepGoing = true;

		dealer.dealCard(player);
		dealer.dealCard(dealer);
		dealer.dealCard(player);
		dealer.dealCard(dealer);

		System.out.println("Hand: ");
		player.showHand();
		System.out.println();

		System.out.println("Value: " + player.getHandValue());
		System.out.println();

		if (player.getHandValue() == 21) {
			System.out.println("**You won!**");

		} else if (player.getHandValue() < 21) {
			System.out.println("Dealers hand: ");
			dealer.dealersHand();
			System.out.println();

			while (keepGoing) {
				System.out.println("============");
				System.out.println("Menu: ");
				System.out.println("1.) Hit");
				System.out.println("2.) Stay");
				System.out.println("============");
				int userInput = sc.nextInt();
				sc.nextLine();
				System.out.println();

				if (userInput == 1) {
					dealer.dealCard(player);

					System.out.println("New hand: ");
					player.showHand();

					System.out.println("Value: " + player.getHandValue());
					System.out.println();

					if (player.getHandValue() > 21) {
						System.out.println("**YOU LOST. EXCEEDED THE VALUE OF 21 WITH THAT LAST CARD.**");
						keepGoing = false;
					} else if (player.getHandValue() < 21) {
						System.out.println("You have the option to keep going!");
					}

				} else if (userInput == 2) {
					System.out.println("You chose to stay. No cards added!");
					System.out.println();
					System.out.println("-----Dealers turn-----");

					boolean keepGoing2 = true;

					while (keepGoing2) {
						if (dealer.getHandValue() < 17) {

							System.out.print(dealer.dealCard(dealer));
							System.out.println(" added to dealer hand. Value was below 17.");
							System.out.println();

							if (dealer.getHandValue() > 21) {
								System.out.println("Dealers Hand: ");
								dealer.dealersHandrevealed();
								System.out.println("Dealers Hand value: ");
								dealer.getHandValue();
								System.out.println();
								System.out.println("**You won! Dealer went over 21.**");
								System.out.println();

								keepGoing2 = false;
							}

						} else if (dealer.getHandValue() > 17) {
							if (dealer.getHandValue() > 21) {
								System.out.println("Dealers Hand: ");
								dealer.dealersHandrevealed();
								System.out.println("Dealers Hand value: " + dealer.getHandValue());
								System.out.println();
								System.out.println("You won! Dealer went over 21.");
								System.out.println();

								keepGoing2 = false;

							} else {
								System.out.println("Dealer chose not to add card.");
								System.out.println();
								System.out.println("Dealers Hand: ");
								dealer.showHand();
								System.out.println();

								if (dealer.getHandValue() > player.getHandValue()) {
									System.out.println("Dealers Hand value: " + dealer.getHandValue());
									System.out.println();
									System.out.println("**You Lost. Dealer was closer to 21 without exceeding limit!**");
									break;
								} else if (dealer.getHandValue() < player.getHandValue()) {
									System.out.println("**You Won!!**");
									System.out.println();
									System.out.println("Dealers Hand: ");
									dealer.dealersHandrevealed();
									System.out.println();
									System.out.println("Dealers Hand value: " + dealer.getHandValue());
									System.out.println();
									break;
								}
							}
						}
					}
					keepGoing = false;

				}

			} // while loop end

		} // else if braket

	}

}
