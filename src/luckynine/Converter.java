package luckynine;

import luckynine.TalkingCard.Ranks;

public abstract class Converter {
	
	public static int convertRankToInt(Ranks cardRank) {
		int count = 0;
		for (Ranks rank : Ranks.values()) {			
			if (rank.equals(cardRank)) {
				if (count+1 >= 10) {
					return 10;
				}
				return count+=1;
			}
			count++;
		}
		return 0;
	}
}
