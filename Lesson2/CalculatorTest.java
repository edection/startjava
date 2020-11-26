import java.util.Scanner;
// отвечает за создание объектов, их инициализацию, запуск вычислений, ввод мат. выражения. Содержит метод main
public class CalculatorTest { 
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		String answer;

		for(;;){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int number1 = scan.nextInt();
		calc.setNumber1(number1);
		System.out.println("Enter the sign of the mathematical operation: ");
		char sign = scan.next().charAt(0);
		calc.setSign(sign);
		System.out.println("Enter the second number: ");
		int number2 = scan.nextInt();
		calc.setNumber2(number2);
		calc.calculate();
		scan.nextLine();

		do {
			System.out.println("Do you want to continue? [yes / no]:");
			answer = scan.nextLine();
				if("no".equals(answer)) {
					System.out.println("Finish");
					return;}
			} while (!"yes".equals(answer));
		}
	}
}