public class MyFirstGame {
	public static void main(String[] args) {
		int computerNum = 15;// компьютер загадывает целое число от 0 до 100
		int playerNum = 10; // число игрока

		if(playerNum < computerNum) {
			while(playerNum != computerNum) {
				System.out.println(playerNum + " Your number is less than the computer's number");
				playerNum++;
			}
		} else if(playerNum > computerNum) {
			while(playerNum != computerNum) {
				System.out.println(playerNum + " Your number is greater than the computer's number");
				playerNum--;
			}
		}
		System.out.println("You've hit it! " + playerNum + " = " + computerNum);
	}
}