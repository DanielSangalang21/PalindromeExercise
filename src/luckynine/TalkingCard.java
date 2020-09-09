package luckynine;

import java.util.Arrays;
import java.util.List;

public class TalkingCard extends Card{
	
	public enum Suits {HEARTS, CLUBS, DIAMONDS, SPADES}
	public enum Ranks {ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING}

	public TalkingCard(String rank, String suit) {
		super(rank, suit);
		this.setRank(rank);
		this.setSuit(suit);
		// TODO Auto-generated constructor stub
	}
	
	
	public void talk() {
		System.out.println(this.getRank() + " OF "+ this.getSuit());
	}
	
	public static TalkingCard[][] generateDeckOfCards() {
			
		TalkingCard[][] cards = new TalkingCard[13][4]; 
		
		int countOuter = 0;
		for (Ranks rank : Ranks.values()) {
			int countInner = 0;
			for (Suits suit : Suits.values()) {
				cards[countOuter][countInner] = new TalkingCard(rank.toString(),suit.toString());
				countInner++;
				}
			countOuter++;
		}	
		return cards;
	}	
	
	public static void displayDeck(TalkingCard[][] talkingCards) {
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
}

