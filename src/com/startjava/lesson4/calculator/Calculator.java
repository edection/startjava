package com.startjava.lesson4.calculator;

public class Calculator {
	private String string;

	public void setExpression(String string) {
		this.string = string;
	}

	public void calculate() {
		String[] signs = string.split("\\s");

		int[] arrayNumbers = new int[2];
		arrayNumbers[0]=Integer.parseInt(signs[0]);
		arrayNumbers[1]=Integer.parseInt(signs[2]);

		switch(signs[1]) {
			case "+" :
				System.out.println("Answer: " + Math.addExact(arrayNumbers[0], arrayNumbers[1]));
				break;
			case "-" :
				System.out.println("Answer: " + Math.subtractExact(arrayNumbers[0], arrayNumbers[1]));
				break;
			case "*" :
				System.out.println("Answer: " + Math.multiplyExact(arrayNumbers[0], arrayNumbers[1]));
				break;
			case "/" :
				System.out.println("Answer: " + Math.floorDiv(arrayNumbers[0], arrayNumbers[1]));
				break;
			case "^" :
				System.out.println("Answer: " + Math.pow(arrayNumbers[0], arrayNumbers[1]));
				break;
		}
	}
}