package luckynine;

import java.util.Arrays;
import java.util.List;

public class TalkingCard {
	
	private Ranks rank;
	private Suits suit;
	public static TalkingCard[][] deck = generateDeckOfCards();
	

	public TalkingCard(Ranks rank,Suits suit) {
		this.rank = rank;
		this.suit = suit;
	}
	
	public static enum Suits {
			HEARTS, CLUBS, DIAMONDS, SPADES
	}
	
	public static enum Ranks {
			//Each enumerables is like an instance of enum ranks so each can call to the 
			//constructor and each had their string suit and public getRank() method since they are instances
			ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING
	}
		
		
	public void talk() {
		System.out.println(this.getRank() + " OF "+ this.getSuit());
	}
	
	private static TalkingCard[][] generateDeckOfCards() {
			
		TalkingCard[][] cards = new TalkingCard[13][4]; 
		
		int countOuter = 0;
		for (Ranks rank : Ranks.values()) {
			int countInner = 0;
			for (Suits suit : Suits.values()) {
				cards[countOuter][countInner] = new TalkingCard(rank,suit);
				countInner++;
				}
			countOuter++;
		}	
		return cards;
	}	
	
	public static void displayDeckFromParameter(TalkingCard[][] talkingCards) {
		for (int i =0; i< talkingCards.length; i++) {
			for (int j =0; j< talkingCards[0].length; j++) {
				try {
					System.out.println(talkingCards[i][j].getRank() + " OF " + talkingCards[i][j].getSuit());
				}
				catch(NullPointerException ex) {
					System.out.println(talkingCards[i][j]);
				}
			}
			System.out.println();;
		}
	}
	
	public Ranks getRank() {
		return this.rank;
	}
	
	public Suits getSuit() {
		return this.suit;
	}
	
	

}

