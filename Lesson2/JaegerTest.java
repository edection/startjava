class JaegerTest {
	public static void main(String[] args) {
		Jaeger one = new Jaeger("StrikerEureka", "Destroyed", 10, 9, 1, 1);

		System.out.println(one.toString());
		one.fire();
		one.leap();

		Jaeger two = new Jaeger("GipsyDanger", "Destroyed", 7, 9, 2, 2);

		System.out.println(two.toString());
		two.fire();
		two.leap();
	}
}