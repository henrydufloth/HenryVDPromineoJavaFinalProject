package Package0;

public class App {
	public static void main(String[] args) {
		Deck newDeck = new Deck();
		Player player1 = new Player("Player 1");
		Player player2 = new Player("Player 2");
		
		newDeck.shuffle();

		for (int i = 0; i < 52; i++) {
			if (i % 2 == 1) {
				player1.draw(newDeck);
			}
			else {
				player2.draw(newDeck);
			}
		}
		
		for (int i = 0; i < 26; i++) {
			Card player1Card = player1.flip();
			Card player2Card = player2.flip();
			int player1CardValue = player1Card.getValue();
			int player2CardValue = player2Card.getValue();
			
			if (player1CardValue > player2CardValue) {
				player1.incrementScore();
			}
			else if (player1CardValue < player2CardValue) {
				player2.incrementScore();
			}
		}
		
		int player1FinalScore = player1.getScore();
		int player2FinalScore = player2.getScore();
		System.out.println("Player 1's score: " + player1FinalScore);
		System.out.println("Player 2's score: " + player2FinalScore);
		if (player1FinalScore > player2FinalScore) {
			System.out.println("Winner: Player 1");
		}
		else if (player1FinalScore < player2FinalScore) {
			System.out.println("Winner: Player 2");
		}
		else {
			System.out.println("Draw");
		}
	}
}
