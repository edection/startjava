public class Jaeger {
	private String name;
	private String status;
	private int speed;
	private int armor;

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

	public void print() {
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
		}
	}
}