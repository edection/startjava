public class Cycle {
	public static void main (String[] args) {
		for(int i = 0; i <= 20; i++) {
			System.out.println(i);
		}

		int result = 6;
		while(result >= -6) {
			System.out.println(result);
			result-=2;
		}

		int number = 9;
		int sumOdds = 0;
		do {
			number = number + 1;
			if(number % 2 != 0) {
				System.out.println(number + " odds");
				sumOdds +=number;
			} 
		} while(number <= 19);
		
		System.out.println(sumOdds);
	}
}