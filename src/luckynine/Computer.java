package luckynine;

public class Computer extends Player {
	
	@Override
	public int deal(TalkingCard[] cards, int remNoOfDraws) {
		int total = 0; 
		if ( remNoOfDraws == 0 ) {
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
			System.out.println("I must draw 3 cards");
		}
		return total;
	}

}
