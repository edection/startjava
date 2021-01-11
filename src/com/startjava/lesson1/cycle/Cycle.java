package com.startjava.lesson1.cycle;

public class Cycle {
	public static void main(String[] args) {
		for(int i = 0; i <= 20; i++) {
			System.out.println(i);
		}

		int counter = 6;
		while(counter >= -6) {
			System.out.println(counter);
			counter -=2;
		}

		int sumOdd = 0;
		counter = 10;
		do {
			counter++;
			if(counter % 2 != 0) {
				System.out.println(counter + " odds");
				sumOdd += counter;
			} 
		} while(counter <= 19);
		System.out.println(sumOdd);
	}
}