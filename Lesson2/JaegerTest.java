class JaegerTest {
	public static void main(String[] args) {
		Jaeger one = new Jaeger();
		one.setName("StrikerEureka");
		one.setStatus("Destroyed");
		one.setSpeed(10);
		one.setArmor(9);

		Jaeger two = new Jaeger();
		two.setName("GipsyDanger");
		two.setStatus("Destroyed");
		two.setSpeed(7);
		two.setArmor(9);

		one.print();
		one.fire(1);
		one.leap(1);

		two.print();
		two.fire(2);
		one.leap(2);
	}
}