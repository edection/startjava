import java.util.Scanner;

public class GuessNumberTest {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the name of first player: ");
		Player playerOne = new Player(scan.nextLine());

		System.out.println("Enter the name of second player: ");
		Player playerTwo = new Player(scan.nextLine());

		GuessNumber game = new GuessNumber(playerOne.getName(), playerTwo.getName());
		game.startGame();
	}
}