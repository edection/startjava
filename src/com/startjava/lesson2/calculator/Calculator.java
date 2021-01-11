package com.startjava.lesson2.calculator;

public class Calculator {
	
	private int number1;
	private int number2;
	private char sign;
	private int result;

	public int getNumber1() {
		return number1;
	}

	public void setNumber1(int number1) {
		this.number1 = number1;
	}

	public int getNumber2() {
		return number2;
	}

	public void setNumber2(int number2) {
		this.number2 = number2;
	}

	public char getSign() {
		return sign;
	}

	public void setSign(char sign) {
		this.sign = sign;
	}

	public void calculate() {
		switch(sign) {
			case '+' :
				result = number1 + number2;
				break; 
			case '-' :
				result = number1 - number2;
				break; 
			case '*' :
				result = number1 * number2;
				break; 
			case '/' :
				if(number2 == 0) {
					System.out.println("Incorrect second number - zero, try again");
				} else {
					result = number1 / number2;
				}
				break;
			case '^' :
				result = 1;
				for(int i = 1; i <= number2; i++) {
					result *= number1;
				}
				break;
		}
		System.out.println(result);
	}
}