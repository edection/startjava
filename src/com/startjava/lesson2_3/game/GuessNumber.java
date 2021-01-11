package com.startjava.lesson2_3.game;

import java.util.Random;

import java.util.Scanner;

public class GuessNumber {
	private int randomNumber;
	private Player playerOne;
	private Player playerTwo;

	Scanner scan = new Scanner(System.in);

	public GuessNumber(Player playerOne, Player playerTwo) {
		this.playerOne = playerOne;
		this.playerTwo = playerTwo;
	}

	public void start() {
		Random random = new Random();
		randomNumber = random.nextInt(101);
		System.out.println("Random number: " + randomNumber);

		while (true) {
			System.out.println(playerOne.getName() + "'s number: ");
			playerOne.setNumber(scan.nextInt());
			if(playerOne.getNumber() == randomNumber) {
				System.out.println(playerOne.getName() + " win!");
				break;
			} else if (playerOne.getNumber() < randomNumber) {
				System.out.println("Number is less than the random number. Next player!");
			} else if (playerOne.getNumber() > randomNumber) {
				System.out.println("Number is greater than the random number. Next player!");
			}

			System.out.println(playerTwo.getName() + "'s number: ");
			playerTwo.setNumber(scan.nextInt());
			if(playerTwo.getNumber() == randomNumber) {
				System.out.println(playerTwo.getName() + " win!");
				break;
			} else if (playerTwo.getNumber() < randomNumber) {
				System.out.println("Number is less than the random number. Next player!");
			} else if (playerTwo.getNumber() > randomNumber) {
				System.out.println("Number is greater than the random number. Next player!");
			}
		}
	}
}