package com.startjava.lesson4_2.game;

import java.util.Arrays;

public class Player {
	private String name;
	private int numAttempt;

	public Player(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	int[] numbers = new int[10];

	public void setNumbers(int numberPlayer, int i) {
		numAttempt = i;
		numbers[i] = numberPlayer;
	}

	public int getNumbers(int i) {
		return numbers[i];
	}

	public int[] getNumbers() {
		return Arrays.copyOf(numbers, numAttempt + 1);
	}

	public int getPlayersNum() {
		return numbers[numAttempt];
	}

	public int getNumAttempt() {
		return numAttempt;
	}

	public void eraseNums() {
		Arrays.fill(numbers, 0, numAttempt, 0);
	}
}