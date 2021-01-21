package com.startjava.lesson4_2.game;

import java.util.Arrays;

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
		System.out.println("Загаданное число: " + randomNumber);

		for (int i = 0; i < 10; i++) {

			System.out.print(playerOne.getName() + " называет число: ");
			playerOne.setNumbers(scan.nextInt(), i);
			if (playerOne.getNumbers(i) == randomNumber) {    // игрок 1 получает число из Player и сравнивает с рандомным
				System.out.println(playerOne.getName() + " угадал!");
				break;
			} else if (playerOne.getNumbers(i) < randomNumber) {
				System.out.println("Это число меньше загаданного значения. Теперь игрок " + playerTwo.getName());
			} else if (playerOne.getNumbers(i) > randomNumber) {
				System.out.println("Это число больше загаданного значения. Теперь игрок " + playerTwo.getName());
			}
			System.out.println("У игрока " + playerOne.getName() + " осталось попыток: " + (10 - (playerOne.getNumAttempt()+1)));

			System.out.print(playerTwo.getName() + " называет число:");
			playerTwo.setNumbers(scan.nextInt(), i);
			if (playerTwo.getNumbers(i) == randomNumber) {
				System.out.println(playerTwo.getName() + " угадал!");
				break;
			} else if (playerTwo.getNumbers(i) < randomNumber) {
				System.out.println("Это число меньше загаданного значения. Теперь игрок " + playerOne.getName());
			} else if (playerTwo.getNumbers(i) > randomNumber) {
				System.out.println("Это число больше загаданного значения. Теперь игрок " + playerOne.getName());
			}
			System.out.println("У игрока " + playerTwo.getName() + " осталось попыток: " + (10 - (playerTwo.getNumAttempt()+1)));
		}
	}

	public void printNumsAndResult() {
		System.out.println("Числа первого игрока " + Arrays.toString(playerOne.getNumbers()));
		System.out.println("Числа второго игрока " + Arrays.toString(playerTwo.getNumbers()));
		if (playerOne.getPlayersNum() == randomNumber) {
			System.out.println("игрок " + playerOne.getName() + " угадал число " + randomNumber + " с " + (playerOne.getNumAttempt()+1) + " попытки");
		} else if (playerTwo.getPlayersNum() == randomNumber) {
			System.out.println("игрок " + playerTwo.getName() + " угадал число " + randomNumber + " с " + (playerTwo.getNumAttempt()+1) + " попытки");
		} else {
			System.out.println("У " + playerOne.getName() + " и " + playerTwo.getName() + " закончились попытки.");
		}
	}
}