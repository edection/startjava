package com.startjava.lesson2_3.robot;

class JaegerTest {
	public static void main(String[] args) {
		Jaeger strikerEureka = new Jaeger("StrikerEureka", "Destroyed", 10, 9, 1, 1);

		System.out.println(strikerEureka);
		strikerEureka.fire();
		strikerEureka.leap();

		Jaeger gipsyDanger = new Jaeger("GipsyDanger", "Destroyed", 7, 9, 2, 2);

		System.out.println(gipsyDanger);
		gipsyDanger.fire();
		gipsyDanger.leap();
	}
}