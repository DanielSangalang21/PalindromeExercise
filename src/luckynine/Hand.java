package luckynine;

public class Hand {
	
  private TalkingCard[] cardsInHand = new TalkingCard[3];
	
	public void addCardToHand(TalkingCard talkingCard) {
		for (int i = 0; i < cardsInHand.length ; i++) {
			if(cardsInHand[i] == null) {
				cardsInHand[i] = talkingCard;
				break;
			}
		}
	}
	
	public TalkingCard[] getCard() {
		return cardsInHand;
	}
}
