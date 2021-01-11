package com.startjava.lesson2_3.wolf;

public class Wolf {
	
	private String name; 
	private String gender;
	private String color;
	private int age;
	private int weight;

	public boolean move() {
		System.out.println("Move");
		return true;
	}

	public boolean sit() {
		System.out.println("Sit");
		return true;
	}

	public boolean run() {
		System.out.println("Run");
		return true;
	}

	public boolean howl() {
		System.out.println("Howl");
		return true;
	}

	public boolean hunt() {
		System.out.println("Hunt");
		return true;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age > 8) {
			System.out.println("Incorrect age"); // если возраст волка > 8 лет, то выведите сообщение "Некорректный возраст"
		} else {
			this.age = age; 
		}
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
}