public class WolfTest {
	public static void main(String[] args) {

		Wolf wolfOne = new Wolf();
		System.out.println("Name " + wolfOne.name);
		System.out.println("Gender " + wolfOne.gender);
		System.out.println("Color " + wolfOne.color);
		System.out.println("Age " + wolfOne.age);
		System.out.println("Weight " + wolfOne.weight);
		System.out.println(wolfOne.move());
		System.out.println(wolfOne.sit());
		System.out.println(wolfOne.run());
		System.out.println(wolfOne.howl());
		System.out.println(wolfOne.hunt());
	}
}