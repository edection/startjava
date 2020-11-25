import java.util.Scanner;

public class CalculatorTest { // отвечает за создание объектов, их инициализацию, запуск вычислений, ввод мат. выражения. Содержит метод main
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number: "); // Введите первое число: 2
		int number1 = scan.nextInt();
		System.out.println("Enter the sign of the mathematical operation: "); // Введите знак математической операции: ^
		char sign = scan.next().charAt(0);
		System.out.println("Enter the second number: "); // Введите второе число: 10
		int number2 = scan.nextInt();

		Calculator one = new Calculator();
		one.setX(number1);
		one.setY(number2);
		one.setSign(sign);
		one.count();

		boolean exit;
		exit = false;

		System.out.println("Do you want to continue? [yes / no]:");
		scan.nextLine();

		for(;;){
			if(exit == true)
				break;
			String answer = scan.nextLine();
			switch(answer) {
				case "yes" : {
					System.out.println("Enter the first number: ");
					number1 = scan.nextInt();
					System.out.println("Enter the sign of the mathematical operation: ");
					sign = scan.next().charAt(0);
					System.out.println("Enter the second number: ");
					number2 = scan.nextInt();
						one.setX(number1);
						one.setY(number2);
						one.setSign(sign);
						one.count();
					}
					break;
				case "no" :
					System.out.println("Finish");
					exit = true;
					break;
				default : {
					System.out.println("Do you want to continue? [yes / no]:");
					}
					break;
			}
		}
	}
}