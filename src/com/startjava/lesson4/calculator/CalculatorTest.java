package com.startjava.lesson4.calculator;

import java.util.Scanner;

public class CalculatorTest { 
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		String answer;

		do {
			Scanner scan = new Scanner(System.in);
			System.out.print("Enter a mathematical expression: ");
			calc.setExpression(scan.nextLine());

			System.out.println("Результат вычисления: " + calc.calculate());

			do {
				System.out.println("Do you want to continue? [yes / no]:");
				answer = scan.nextLine();
			} while (!"no".equals(answer) && !"yes".equals(answer));
		} while (!"no".equals(answer));
		System.out.println("Finish");
	}
}