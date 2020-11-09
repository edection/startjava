public class MyFirstGame {
	public static void main(String[] args) {
		int computerNum = 10;// компьютер загадывает целое число от 0 до 100
		int player = 15; // число игрока

		if(player < computerNum) {
			do{
				System.out.println(player + " Your number is less than the computer's number");
				player++;
			} while(player != computerNum);
			} else if(player > computerNum) {
			while(player != computerNum) {
				System.out.println(player + " Your number is greater than the computer's number");
				player--;
			}
		}
		System.out.println("You've hit it " + player + " = " + computerNum);
	}
}