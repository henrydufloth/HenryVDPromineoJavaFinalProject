package Package0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	//Needs to be 52
	private ArrayList<Card> cards = new ArrayList<Card>();
	
	public Deck() {
		Card twoOfHearts = new Card("Two of Hearts", 2);
		cards.add(twoOfHearts);
		Card threeOfHearts = new Card("Three of Hearts", 3);
		cards.add(threeOfHearts);
		Card fourOfHearts = new Card("Four of Hearts", 4);
		cards.add(fourOfHearts);
		Card fiveOfHearts = new Card("Five of Hearts", 5);
		cards.add(fiveOfHearts);
		Card sixOfHearts = new Card("Six of Hearts", 6);
		cards.add(sixOfHearts);
		Card sevenOfHearts = new Card("Seven of Hearts", 7);
		cards.add(sevenOfHearts);
		Card eightOfHearts = new Card("Eight of Hearts", 8);
		cards.add(eightOfHearts);
		Card nineOfHearts = new Card("Nine of Hearts", 9);
		cards.add(nineOfHearts);
		Card tenOfHearts = new Card("Ten of Hearts", 10);
		cards.add(tenOfHearts);
		Card jackOfHearts = new Card("Jack of Hearts", 11);
		cards.add(jackOfHearts);
		Card queenOfHearts = new Card("Queen of Hearts", 12);
		cards.add(queenOfHearts);
		Card kingOfHearts = new Card("King of Hearts", 13);
		cards.add(kingOfHearts);
		Card aceOfHearts = new Card("Ace of Hearts", 14);
		cards.add(aceOfHearts);
		
		Card twoOfDiamonds = new Card("Two of Diamonds", 2);
		cards.add(twoOfDiamonds);
		Card threeOfDiamonds = new Card("Three of Diamonds", 3);
		cards.add(threeOfDiamonds);
		Card fourOfDiamonds = new Card("Four of Diamonds", 4);
		cards.add(fourOfDiamonds);
		Card fiveOfDiamonds = new Card("Five of Diamonds", 5);
		cards.add(fiveOfDiamonds);
		Card sixOfDiamonds = new Card("Six of Diamonds", 6);
		cards.add(sixOfDiamonds);
		Card sevenOfDiamonds = new Card("Seven of Diamonds", 7);
		cards.add(sevenOfDiamonds);
		Card eightOfDiamonds = new Card("Eight of Diamonds", 8);
		cards.add(eightOfDiamonds);
		Card nineOfDiamonds = new Card("Nine of Diamonds", 9);
		cards.add(nineOfDiamonds);
		Card tenOfDiamonds = new Card("Ten of Diamonds", 10);
		cards.add(tenOfDiamonds);
		Card jackOfDiamonds = new Card("Jack of Diamonds", 11);
		cards.add(jackOfDiamonds);
		Card queenOfDiamonds = new Card("Queen of Diamonds", 12);
		cards.add(queenOfDiamonds);
		Card kingOfDiamonds = new Card("King of Diamonds", 13);
		cards.add(kingOfDiamonds);
		Card aceOfDiamonds = new Card("Ace of Diamonds", 14);
		cards.add(aceOfDiamonds);
		
		Card twoOfSpades = new Card("Two of Spades", 2);
		cards.add(twoOfSpades);
		Card threeOfSpades = new Card("Three of Spades", 3);
		cards.add(threeOfSpades);
		Card fourOfSpades = new Card("Four of Spades", 4);
		cards.add(fourOfSpades);
		Card fiveOfSpades = new Card("Five of Spades", 5);
		cards.add(fiveOfSpades);
		Card sixOfSpades = new Card("Six of Spades", 6);
		cards.add(sixOfSpades);
		Card sevenOfSpades = new Card("Seven of Spades", 7);
		cards.add(sevenOfSpades);
		Card eightOfSpades = new Card("Eight of Spades", 8);
		cards.add(eightOfSpades);
		Card nineOfSpades = new Card("Nine of Spades", 9);
		cards.add(nineOfSpades);
		Card tenOfSpades = new Card("Ten of Spades", 10);
		cards.add(tenOfSpades);
		Card jackOfSpades = new Card("Jack of Spades", 11);
		cards.add(jackOfSpades);
		Card queenOfSpades = new Card("Queen of Spades", 12);
		cards.add(queenOfSpades);
		Card kingOfSpades = new Card("King of Spades", 13);
		cards.add(kingOfSpades);
		Card aceOfSpades = new Card("Ace of Spades", 14);
		cards.add(aceOfSpades);
		
		Card twoOfClubs = new Card("Two of Clubs", 2);
		cards.add(twoOfClubs);
		Card threeOfClubs = new Card("Three of Clubs", 3);
		cards.add(threeOfClubs);
		Card fourOfClubs = new Card("Four of Clubs", 4);
		cards.add(fourOfClubs);
		Card fiveOfClubs = new Card("Five of Clubs", 5);
		cards.add(fiveOfClubs);
		Card sixOfClubs = new Card("Six of Clubs", 6);
		cards.add(sixOfClubs);
		Card sevenOfClubs = new Card("Seven of Clubs", 7);
		cards.add(sevenOfClubs);
		Card eightOfClubs = new Card("Eight of Clubs", 8);
		cards.add(eightOfClubs);
		Card nineOfClubs = new Card("Nine of Clubs", 9);
		cards.add(nineOfClubs);
		Card tenOfClubs = new Card("Ten of Clubs", 10);
		cards.add(tenOfClubs);
		Card jackOfClubs = new Card("Jack of Clubs", 11);
		cards.add(jackOfClubs);
		Card queenOfClubs = new Card("Queen of Clubs", 12);
		cards.add(queenOfClubs);
		Card kingOfClubs = new Card("King of Clubs", 13);
		cards.add(kingOfClubs);
		Card aceOfClubs = new Card("Ace of Clubs", 14);
		cards.add(aceOfClubs);}
	
	public List<Card> shuffle() {
		Collections.shuffle(cards);
		return cards;
	}
	public Card draw() {
		Card cardDrew = cards.get(0);
		cards.remove(0);
		return cardDrew;
	}
}
