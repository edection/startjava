package com.startjava.lesson4_1.calculator;

public class Calculator {
	private String expression;
	double result;

	public void setExpression(String expression) {
		this.expression = expression;
	}

	public void calculate() {
		String[] signs = expression.split("\\s");

		int numberOne = Integer.parseInt(signs[0]);
		int numberTwo = Integer.parseInt(signs[2]);

		switch(signs[1]) {
			case "+" :
				result = Math.addExact(numberOne, numberTwo);
				break;
			case "-" :
				result = Math.subtractExact(numberOne, numberTwo);
				break;
			case "*" :
				result = Math.multiplyExact(numberOne, numberTwo);
				break;
			case "/" :
				result = Math.floorDiv(numberOne, numberTwo);
				break;
			case "^" :
				result = Math.pow(numberOne, numberTwo);
				break;
		}
		System.out.println(result);
	}
}