package luckynine;

import java.util.Random;

public abstract class Randomizer {
	private static final int randomLength = 13;
	private static final int randomWidth = 4;
	
	public static TalkingCard drawRandomCard(TalkingCard[][] talkingCards) {
		boolean isNull = true;
		
		while (isNull) {
			Random rand = new Random();
			int x = rand.nextInt(randomLength);
			int y = rand.nextInt(randomWidth);
			if (talkingCards[x][y] != null) {				
				TalkingCard temp = new TalkingCard(null,null);
				temp = talkingCards[x][y];
				talkingCards[x][y] = null;
				return temp;				
			}
		}
		return null;
	}
	
}





