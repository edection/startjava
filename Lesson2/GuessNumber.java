import java.util.Random;

import java.util.Scanner;

public class GuessNumber {
	private boolean playerWin;
	private int playerNumber;
	private int randomNumber;

	public GuessNumber(int randomNumber, int playerNumber) {
		this.randomNumber = randomNumber;
		this.playerNumber = playerNumber;
	}

	public GuessNumber(boolean playerWin) {
		this.playerWin = false;
	}

	public void startGame() {
		if(playerNumber == randomNumber) {
			playerWin = true;
			System.out.println("This player win!");
		} else {
			System.out.println("Wrong number. Next player!");
		}
	}
}