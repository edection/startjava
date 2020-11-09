public class MyFirstGame {
	public static void main(String[] args) {
		int computer = 15;// компьютер загадывает целое число от 0 до 100
		int player = 10; // число игрока

		if(player < computer) {
			do {
				System.out.println(player + " Vvedennoe vami chislo menshe togo, chto zagadal kompyuter");
				player++;
			} while (player < computer);

		} else if(player > computer) {
			while(player > computer) {
				System.out.println(player + " Vvedennoe vami chislo bolshe togo, chto zagadal kompyuter");
				player--;
			} // while
		} // else if
		System.out.println("Vi ugadali!" + " " + player + "=" + computer);
	} // main
} // class