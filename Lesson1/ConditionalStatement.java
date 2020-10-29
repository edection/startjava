public class ConditionalStatement {
	public static void main(String[] args) {
		int age = 21;
		if (age > 20) {
			System.out.println("Over 20 years old");
		} else {
			System.out.println("Under 20 years of age");
		}

		boolean male = true;
		if (male) {
			System.out.println("Male");
		}

		if (!male) {
			System.out.println("Not male");
		}

		float height = 1.80f;
		if (height < 1.80) {
			System.out.println("Below 1 meter 80 cm.");
		} else {
			System.out.println("Above 1 meter 80 cm.");
		}

		char firstNameLetter = 'M';
		if (firstNameLetter == 'M') {
			System.out.println("M - first name letter");
		} else if (firstNameLetter == 'I') {
			System.out.println("I - first name letter");
		} else {
			System.out.println("any first name letter other than M and I");
		}
	}
}