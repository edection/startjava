package com.startjava.lesson2.robot;

public class Jaeger {
	private String name;
	private String status;
	private int speed;
	private int armor;
	private int fire;
	private int leap;

	public Jaeger(String jaegerName, String jaegerStatus, int jaegerSpeed, int jaegerArmor, int jaegerFire, int jaegerLeap) {
		this.name = jaegerName;
		this.status = jaegerStatus;
		this.speed = jaegerSpeed;
		this.armor = jaegerArmor;
		this.fire = jaegerFire;
		this.leap = jaegerLeap;
	}

	public String getName() {
		return name;
	} 

	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getArmor() {
		return armor;
	}

	public void setArmor(int armor) {
		this.armor = armor;
	}

	public String toString() {
		return "Name " + name + "; Status " + status + "; Speed " + speed + "; Armor " + armor;
	}

	public void fire() {
		if (fire == 1) {
			System.out.println("Fire a heat weapon");
		} else if (fire == 2) {
			System.out.println("Fire a rocket");
		}
	}

	public void leap() {
		if (leap == 1) {
			System.out.println("Low jumps");
		} else if (leap == 2) {
			System.out.println("Leap into the air");
		}
	}
}