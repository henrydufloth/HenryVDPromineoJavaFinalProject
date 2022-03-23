package Package0;

public class Card {

	private int value;;
	private String name;

	public Card(String name, int value) {
		this.name = name;
		this.value = value;
	}

	public void describe() {
		System.out.println("Card: " + name);
		System.out.println("value: " + value);
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


}
