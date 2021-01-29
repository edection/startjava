package com.startjava.lesson4.game;

import java.util.Random;

import java.util.Scanner;

public class GuessNumber {
	private int randomNum;
	private Player playerOne;
	private Player playerTwo;

	Scanner scan = new Scanner(System.in);

	public GuessNumber(Player playerOne, Player playerTwo) {
		this.playerOne = playerOne;
		this.playerTwo = playerTwo;
	}

	public void start() {
		Random random = new Random();
		randomNum = random.nextInt(101);
		System.out.println("Загаданное число: " + randomNum);

		for (int i = 0; i < 10; i++) {
			if(makeMove(playerOne)) {
				resultGame(playerOne);
				break;
			}
			if(makeMove(playerTwo)) {
				resultGame(playerTwo);
				break;
			}
		}

		System.out.print("Числа первого игрока: " );
		printNums(playerOne);
		System.out.print("Числа второго игрока: ");
		printNums(playerTwo);

		playerOne.clear();
		playerTwo.clear();
	}

	private boolean makeMove(Player player) {
		enterNum(player);
		return checkNum(player);
	}

	private void enterNum(Player player) {
		System.out.print(player.getName() + " называет число: ");
		player.setNum(scan.nextInt());
	}

	private boolean checkNum(Player player) {
		if (player.getNum() == randomNum) {
			System.out.println(player.getName() + " угадал!");
			return true;
		}
		System.out.println((player.getNum() < randomNum) ? "Это число меньше загаданного значения" : "Это число больше загаданного значения");
		System.out.println("У игрока " + player.getName() + " осталось попыток: " + (10 - player.getNumAttempt()));
		if (player.getNumAttempt() == 10) {
			System.out.println("У " + player.getName() + " закончились попытки.");
		}
		return false;
	}

	private void printNums(Player player) {
		for (int num : player.getAllNums()) {
			System.out.print(num + " ");
		}
		System.out.println();
	}

	private void resultGame(Player player) {
		if (player.getNum() == randomNum) {
			System.out.println("игрок " + player.getName() + " угадал число " + randomNum + " с " + player.getNumAttempt() + " попытки");
		}
	}
}