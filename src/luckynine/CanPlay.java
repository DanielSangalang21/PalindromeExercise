package luckynine;

public interface CanPlay {
	public TalkingCard drawCard(TalkingCard[][] talkingCards);
	public abstract int deal(TalkingCard[] cards, int remNoOfDraws);
}
