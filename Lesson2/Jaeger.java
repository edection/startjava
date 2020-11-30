public class Jaeger {
	private String name;
	private String status;
	private int speed;
	private int armor;

	public Jaeger (String name, String status, int speed, int armor) {
		System.out.println("Name " + name);
		System.out.println("Status " + status);
		System.out.println("Speed " + speed);
		System.out.println("Armor " + armor);
	}

	public void fire(int x) {
		if (x == 1) {
			System.out.println("Fire a heat weapon");
		} else if (x == 2) {
			System.out.println("Fire a rocket");
		}
	}

	public void leap(int y) {
		if (y == 1) {
			System.out.println("Low jumps");
		} else if (y == 2) {
			System.out.println("Leap into the air");
		} // else if
	} // метод
} // class


