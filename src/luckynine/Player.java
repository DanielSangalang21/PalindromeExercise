package luckynine;

public abstract class Player implements CanPlay {
	
	private static final int NO_OF_DRAWS = 3;
	private int noOfDraws;
	//private TalkingCard[] cardsInHand = new TalkingCard[3];
	private Hand hand;

	public Player() {
		this.noOfDraws = NO_OF_DRAWS;
		this.hand = new Hand();
	}
	
	public void showCardsInHands() {
		TalkingCard[] talkingCards = hand.getCard();
		for (int i = 0; i < talkingCards.length ; i++) {
			if (talkingCards[i] != null)
			{
				System.out.println(i+1+") "+ talkingCards[i].getRank() +" OF "+ talkingCards[i].getSuit());
			}
		}
	}
	
	public TalkingCard drawCard(TalkingCard[][] talkingCards) {
		TalkingCard talkingCard = new TalkingCard(null,null);
		talkingCard = Randomizer.drawRandomCard(talkingCards);
		this.deductNoOfDraws(1);
		
		return talkingCard;
	}
	
	public abstract int deal(TalkingCard[] cards, int remNoOfDraws);
	
	public int getNoOfDraws() {
		return noOfDraws;
	}

	public void setNoOfDraws(int noOfDraws) {
		this.noOfDraws = noOfDraws;
	}

	public void deductNoOfDraws(int deduction) {
		this.noOfDraws -= deduction;
	}
	
	public Hand getHand() {
		return hand;
	}

	public void setHand(Hand hand) {
		this.hand = hand;
	}
}
