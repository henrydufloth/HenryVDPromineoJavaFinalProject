package Package0;

import java.util.ArrayList;
import java.util.List;

public class Player {
	private List<Card> hand = new ArrayList<Card>();
	private int score;
	private String name;
	
	public Player(String name) {
	    score = 0;
	    hand = new ArrayList<Card>();
	  }

	public void describe() {
		System.out.println("Player name: " + name);
		System.out.println(name + " score:" + score);
		for (Card card : hand) {
			card.describe();
		}
	}
	
	public Card flip() {
		Card cardDrew = hand.get(0);
		hand.remove(0);
		return cardDrew;	
	}
	
	public void draw(Deck deck) {
		hand.add(deck.draw());	
	}

	public void incrementScore() {
		score += 1;
	}
	
    public int getScore() {
		return score;
    }

}
