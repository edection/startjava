import java.util.Scanner;

public class CalculatorTest { 
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		String answer;

		do {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the first number: ");
			calc.setNumber1(scan.nextInt());
			System.out.println("Enter the sign of the mathematical operation: ");
			calc.setSign(scan.next().charAt(0));
			System.out.println("Enter the second number: ");
			calc.setNumber2(scan.nextInt());
			calc.calculate();
			scan.nextLine();

			do {
				System.out.println("Do you want to continue? [yes / no]:");
				answer = scan.nextLine();
			} while (!"no".equals(answer) && !"yes".equals(answer));
		} while (!"no".equals(answer));
		System.out.println("Finish");
	}
}