import java.util.Random;

import java.util.Scanner;

public class GuessNumber {
	int randomNumber;
	String answer;
	String playerOne;
	String playerTwo;

	Scanner scan = new Scanner(System.in);

	public GuessNumber(String playerOne, String playerTwo) {
		this.playerOne = playerOne;
		this.playerTwo = playerTwo;
	}

	public void startGame() {
		do {
		Random random = new Random();
		randomNumber = random.nextInt(101);
		System.out.println("Random number: " + randomNumber);

			while (true) {
			System.out.println(playerOne + "'s number: ");
			Player numberOne = new Player(scan.nextInt());
				if(numberOne.getNumber() == randomNumber) {
					System.out.println(playerOne + " win!");
					break;
				} else {
					System.out.println("Wrong number. Next player!");
				}
			System.out.println(playerTwo + "'s number: ");
			Player numberTwo = new Player(scan.nextInt());
				if(numberTwo.getNumber() == randomNumber) {
					System.out.println(playerTwo + " win!");
					break;
				} else {
					System.out.println("Wrong number. Next player!");
				}
			}

			scan.nextLine();

			do {
				System.out.println("Do you want to continue? [yes / no]:");
				answer = scan.nextLine();
			} while (!"no".equals(answer) && !"yes".equals(answer));
		} while (!"no".equals(answer));
		System.out.println("Finish");
	}
}