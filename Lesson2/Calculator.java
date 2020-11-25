public class Calculator { // отвечает за мат. вычисления и проверку мат. знака
	
	private int x;
	private int y;
	private char sign;
	private int result;

	public int getX() {
		return x;
	}

	public void setX(int x1) {
		x = x1;
	}

	public int getY() {
		return y;
	}

	public void setY(int y1) {
		y = y1;
	}

	public char getSign() {
		return sign;
	}

	public void setSign(char sign1) {
		sign = sign1;
	}

	public void count() {
		switch(sign) { // проверка мат. знака и вычисление
			case '+' :
				result = x + y; {
					System.out.println(result);
				}
				break; 
			case '-' :
				result = x - y; {
					System.out.println(result);
				}
				break; 
			case '*' :
				result = x * y; {
					System.out.println(result);
				}
				break; 
			case '/' :
				if(y == 0) {
					System.out.println("Incorrect second number - zero, try again"); // условие о недопустимости деления на ноль
				} else {
				result = x / y; {
					System.out.println(result);
				}
				break; 
			}
		}
	}
}