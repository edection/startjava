package com.startjava.lesson4_2.game;

import java.util.Scanner;

public class GuessNumberTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("У каждого игрока 10 попыток.");

		System.out.print("Укажите имя первого игрока: ");
		Player playerOne = new Player(scan.nextLine());

		System.out.print("Укажите имя второго игрока: ");
		Player playerTwo = new Player(scan.nextLine());

		String answer;
		
		do {
			GuessNumber game = new GuessNumber(playerOne, playerTwo);
			game.start();
			game.printNumsAndResult();
			playerOne.eraseNums();
			playerTwo.eraseNums();

			do {
				System.out.println("Do you want to continue? [yes / no]:");
				answer = scan.nextLine();
			} while (!"no".equals(answer) && !"yes".equals(answer));
		} while (!"no".equals(answer));
		System.out.println("Finish");
	}
}