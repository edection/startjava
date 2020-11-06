public class Calculator {
	public static void main(String[] args) {
		char sign = '/'; // знак математической операции
		int x = 6; // ввести первое целое положительное число
		int y = 1; // ввести второе целое положительное число
		int result = 0;
		if(sign == '+') {
			result = x + y;
			System.out.println(x + " " + "+" + " " + y + "=" + " " + result);
		} else if(sign == '-') {
			result = x - y;
			System.out.println(x + " " + "-" + " " + y + "=" + " " + result);
		} else if(sign == '*') {
			result = x * y;
			System.out.println(x + " " + "*" + " " + y + "=" + " " + result);
		} else if(sign == '/' && y > 0) {
			result = x / y;
			System.out.println(x + " " + "/" + " " + y + "=" + " " + result);
		} else if(sign == '/' && y == 0) {
			System.out.println(x + " " + "/" + " " + y + " Ups, divide by zero! Try again :) ");
		} else if(sign == '^') {
			int result1 = 1;
			for(int i = 1; i <= y; i++) {
			result1 = result1 * x;
			}
			System.out.println(x + " " + "^" + " " + y + "=" + " " + result1);
		} else if(sign == '%') {
			result = x % y;
			System.out.println(x + " " + "%" + " " + y + "=" + " " + result);
		} else {
			System.out.println("Something wrong! Try again");
		}
	}
}