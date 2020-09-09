package luckynine;

public class User extends Player{

	@Override
	public int deal(TalkingCard[] cards, int remNoOfDraws) {
		int total = 0; 
		if(remNoOfDraws<=1) {
			for (int i = 0 ; i < cards.length ;i++ ) {
				if (cards[i] != null) {
				int converted = Converter.convertRankToInt(cards[i].getRank());
				total  += converted;
				}
			}
			while (total > 9) {
				total -= 10;
			}
			return total;
		}
		else {
			System.out.println("You only have 1 card, unable to deal");
		}
		return total;
	}
	
}
