package staticex;

public class Quiz1 {

	public static void main(String[] args) {
		
		Card card1 = new Card();
		card1.cardName = "card1";
		System.out.println(card1.cardName + ',' + card1.cardNumber);
		
		Card card2 = new Card();
		card2.cardName = "card2";
		System.out.println(card2.cardName + ',' + card2.cardNumber);
		
		Card card3 = new Card();
		card3.cardName = "card3";
		System.out.println(card3.cardName + ',' + card3.cardNumber);

	}

}
class Card {
	
	static int count = 100;
	String cardName;
	int cardNumber;
	
	public Card() {
		cardNumber = count;
		count++;
	}
}