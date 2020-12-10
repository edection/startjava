import java.util.Scanner;

public class GuessNumberTest {
	public static void main(String[] args) {
		String answer;

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the name of first player: ");
		Player playerOne = new Player(scan.nextLine());

		System.out.println("Enter the name of second player: ");
		Player playerTwo = new Player(scan.nextLine());

		do {
			GuessNumber game = new GuessNumber(playerOne, playerTwo);
			game.start();

			do {
				System.out.println("Do you want to continue? [yes / no]:");
				answer = scan.nextLine();
			} while (!"no".equals(answer) && !"yes".equals(answer));
		} while (!"no".equals(answer));
		System.out.println("Finish");
	}
}