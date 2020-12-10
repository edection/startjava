import java.util.Random;

import java.util.Scanner;

public class GuessNumber {
	int randomNumber;
	Player playerOne;
	Player playerTwo;

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
		} else {
			System.out.println("Wrong number. Next player!");
		}
		System.out.println(playerTwo.getName() + "'s number: ");
		playerTwo.setNumber(scan.nextInt());
		if(playerTwo.getNumber() == randomNumber) {
			System.out.println(playerTwo.getName() + " win!");
			break;
		} else {
			System.out.println("Wrong number. Next player!");
			}
		}
	}
}