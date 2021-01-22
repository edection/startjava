package com.startjava.lesson4.game;

import java.util.Arrays;

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

			System.out.print(playerOne.getName() + " называет число: ");
			playerOne.setNum(scan.nextInt(), i);
			if (playerOne.getLastNum(i) == randomNum) {    // игрок 1 получает число из Player и сравнивает с рандомным
				System.out.println(playerOne.getName() + " угадал!");
				break;
			} else if (playerOne.getLastNum(i) < randomNum) {
				System.out.println("Это число меньше загаданного значения. Теперь игрок " + playerTwo.getName());
			} else if (playerOne.getLastNum(i) > randomNum) {
				System.out.println("Это число больше загаданного значения. Теперь игрок " + playerTwo.getName());
			}
			System.out.println("У игрока " + playerOne.getName() + " осталось попыток: " + (10 - playerOne.getNumAttempt()));

			System.out.print(playerTwo.getName() + " называет число:");
			playerTwo.setNum(scan.nextInt(), i);
			if (playerTwo.getLastNum(i) == randomNum) {
				System.out.println(playerTwo.getName() + " угадал!");
				break;
			} else if (playerTwo.getLastNum(i) < randomNum) {
				System.out.println("Это число меньше загаданного значения. Теперь игрок " + playerOne.getName());
			} else if (playerTwo.getLastNum(i) > randomNum) {
				System.out.println("Это число больше загаданного значения. Теперь игрок " + playerOne.getName());
			}
			System.out.println("У игрока " + playerTwo.getName() + " осталось попыток: " + (10 - playerTwo.getNumAttempt()));
		}

		System.out.println("Числа первого игрока " + Arrays.toString(playerOne.getLastNum()));
		System.out.println("Числа второго игрока " + Arrays.toString(playerTwo.getLastNum()));
		if (playerOne.getPlayersNum() == randomNum) {
			System.out.println("игрок " + playerOne.getName() + " угадал число " + randomNum + " с " + playerOne.getNumAttempt() + " попытки");
		} else if (playerTwo.getPlayersNum() == randomNum) {
			System.out.println("игрок " + playerTwo.getName() + " угадал число " + randomNum + " с " + playerTwo.getNumAttempt() + " попытки");
		} else {
			System.out.println("У " + playerOne.getName() + " и " + playerTwo.getName() + " закончились попытки.");
		}
		playerOne.clear();
		playerTwo.clear();
	}
}