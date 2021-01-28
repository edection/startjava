package com.startjava.lesson4.game;

import java.util.Arrays;

public class Player {
	private String name;
	private int numAttempt;
	private int[] nums = new int[10];

	public Player(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setNum(int num) {
		numAttempt++;
		nums[numAttempt - 1] = num;
	}

	public int getNum() {
		return nums[numAttempt - 1];
	}

	public int[] getAllNums() {
		return Arrays.copyOf(nums, numAttempt);
	}

	public int getNumAttempt() {
		return numAttempt;
	}

	public void clear() {
		Arrays.fill(nums, 0, numAttempt, 0);
		numAttempt = 0;
	}
}