package com.startjava.lesson4.calculator;

public class Calculator {
	private String expression;

	public void setExpression(String expression) {
		this.expression = expression;
	}

	public int calculate() {
		String[] signs = expression.split(" ");

		int numberOne = Integer.parseInt(signs[0]);
		int numberTwo = Integer.parseInt(signs[2]);

		switch (signs[1]) {
			case "+":
				return Math.addExact(numberOne, numberTwo);
			case "-":
				return Math.subtractExact(numberOne, numberTwo);
			case "*":
				return Math.multiplyExact(numberOne, numberTwo);
			case "/":
				return Math.floorDiv(numberOne, numberTwo);
			case "^":
				return (int) Math.pow(numberOne, numberTwo);
			default:
				return 0;
		}
	}
}