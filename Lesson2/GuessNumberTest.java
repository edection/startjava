import java.util.Random;

import java.util.Scanner;

public class GuessNumberTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String answer;

		System.out.println("Enter the name of first player: ");
		Player playerOne = new Player(scan.nextLine());

		System.out.println("Enter the name of second player: ");
		Player playerTwo = new Player(scan.nextLine());

		do {
		Random random = new Random();
		int randomNumber = random.nextInt(101);
		System.out.println("Random number: " + randomNumber);

			while (true) {
			System.out.println(playerOne.getName() + "'s number: ");
			playerOne.setPlayerNumber(scan.nextInt());
			GuessNumber playerOneGame = new GuessNumber(randomNumber, playerOne.getPlayerNumber());
			playerOneGame.startGame();
			if(playerOne.getPlayerNumber() == randomNumber) break;
			System.out.println(playerTwo.getName() + "'s number: "); 
			playerTwo.setPlayerNumber(scan.nextInt());
			GuessNumber playerTwoGame = new GuessNumber(randomNumber, playerTwo.getPlayerNumber());
			playerTwoGame.startGame();
			if(playerTwo.getPlayerNumber() == randomNumber) break;
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