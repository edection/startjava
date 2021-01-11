package com.startjava.lesson1.calculator;

public class Calculator {
	public static void main(String[] args) {
		char sign = '+'; // знак математической операции
		int x = 6; // ввести первое целое положительное число
		int y = 3; // ввести второе целое положительное число
		int result = 0;

		if(sign == '+') {
			result = x + y;
		} else if(sign == '-') {
			result = x - y;
		} else if(sign == '*') {
			result = x * y;
		} else if(sign == '/' && y > 0) {
			result = x / y;
		} else if(sign == '/' && y == 0) {
			System.out.println(x + " " + "/" + " " + y + " Ups, divide by zero! Try again :) ");
		} else if(sign == '^') {
			result = 1;
			for(int i = 1; i <= y; i++) {
				result *= x;
			}
		} else if(sign == '%') {
			result = x % y;
		} else {
			System.out.println("Something wrong! Try again");
		} // else
		System.out.println(result);
	} // main
} // class