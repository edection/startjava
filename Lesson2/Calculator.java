public class Calculator {
	
	private int number1;
	private int number2;
	private char sign;
	private int result;

	public int getNumber1() {
		return number1;
	}

	public void setNumber1(int number11) {
		number1 = number11;
	}

	public int getNumber2() {
		return number2;
	}

	public void setNumber2(int number22) {
		number2 = number22;
	}

	public char getSign() {
		return sign;
	}

	public void setSign(char sign1) {
		sign = sign1;
	}

	public void calculate() {
		switch(sign) {
			case '+' :
				result = number1 + number2;
				System.out.println(result);
				break; 
			case '-' :
				result = number1 - number2;
				System.out.println(result);
				break; 
			case '*' :
				result = number1 * number2;
				System.out.println(result);
				break; 
			case '/' :
				if(number2 == 0) {
					System.out.println("Incorrect second number - zero, try again");
				} else {
				result = number1 / number2;
				}
				System.out.println(result);
				break;
			case '^' :
				result = 1;
				for(int i = 1; i <= number2; i++) {
				result *= number1;
				}
				System.out.println(result);
				break;
		}
	}
}