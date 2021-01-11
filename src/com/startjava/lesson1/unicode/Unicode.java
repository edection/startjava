package com.startjava.lesson1.unicode;

public class Unicode {
	public static void main(String[] args) {
		int startRange = 33; // начало диапазона
		int endRange = 126; // конец диапазона

		do {
			System.out.println(startRange + " = " + (char) startRange);
			startRange++;
		} while(startRange <= endRange);
	}
}