public class Player {
	private String name;
	private int playerNumber;

	public Player(String name) {
		this.name = name;
//		System.out.println(name);
	}

	public String getName() {
		return name;
	}

	public int getPlayerNumber() {
		return playerNumber;
	}

	public void setPlayerNumber(int playerNumber) {
		this.playerNumber = playerNumber;
	}
}