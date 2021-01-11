package com.startjava.lesson2_3.wolf;

public class WolfTest {
	public static void main(String[] args) {
		Wolf wolfOne = new Wolf();

		wolfOne.setName("Wolfenstein");
		System.out.println(wolfOne.getName());

		wolfOne.setGender("Male");
		System.out.println(wolfOne.getGender());

		wolfOne.setColor("Grey");
		System.out.println(wolfOne.getColor());

		wolfOne.setAge(7);
		System.out.println(wolfOne.getAge());

		wolfOne.setWeight(10);
		System.out.println(wolfOne.getWeight());

		System.out.println(wolfOne.move());
		System.out.println(wolfOne.sit());
		System.out.println(wolfOne.run());
		System.out.println(wolfOne.howl());
		System.out.println(wolfOne.hunt());
	}
}