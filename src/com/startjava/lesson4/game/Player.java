package com.startjava.lesson4.game;

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

	private int[] nums = new int[10];

	public void setNum(int num, int i) {
		numAttempt++;
		nums[i] = num;
	}

	public int getLastNum(int i) {
		return nums[i];
	}

	public int[] getLastNum() {
		return Arrays.copyOf(nums, numAttempt);
	}

	public int getNumAttempt() {
		return numAttempt;
	}

	public int getPlayersNum() {
		return nums[numAttempt - 1];
	}

	public void clear() {
		Arrays.fill(nums, 0, numAttempt, 0);
		numAttempt = 0;
	}
}