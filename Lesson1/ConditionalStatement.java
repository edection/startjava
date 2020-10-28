public class ConditionalStatement {
	public static void main(String[] args) {
		int age = 21;
		if (age > 20) {
			System.out.println("Старше 20 лет");
		} else {
			System.out.println("Младше 20 лет");
		}

		boolean male = true;
		if (male = true) {
			System.out.println("Мужчина");
		} else {
			System.out.println("Не мужского пола");
		}
		
		if (male != false) {
			System.out.println("Не мужского пола");
		} else {
			System.out.println("Мужчина");
		}

		float height = 1.80f;
		if (height < 1.80) {
			System.out.println("Ниже 1 метра 80 см.");
		} else {
			System.out.println("От 1 метра 80 см.");
		}

		char firstInitial = 'M';
		if (firstInitial == 'M') {
			System.out.println("M - первая буква в имени");
		} else if (firstInitial == 'I') {
			System.out.println("I - первая буква в имени");
		} else {
			System.out.println(" любая первая буква в имени, кроме M и I");
		}
	}
}