class JaegerTest {
	public static void main(String[] args) {

		String name = "StrikerEureka";
		String status = "Destroyed";
		int speed = 10;
		int armor = 9;

		Jaeger one = new Jaeger(name, status, speed, armor);
		one.fire(1);
		one.leap(1);

		name = "GipsyDanger";
		status = "Destroyed";
		speed = 7;
		armor = 9;

		Jaeger two = new Jaeger(name, status, speed, armor);
		two.fire(2);
		two.leap(2);
	}
}