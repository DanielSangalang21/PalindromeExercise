package SeafoodExercise;

public class Basket {
private Seafood[] seafoods = new Seafood[10];

	public void put(Seafood seafood) {
		int count = 0;
		for(Seafood s : seafoods) {
			if (s == null) {
				seafoods[count] = seafood;
				return;
			}
			count++;
		}		
	}
	
	public Seafood get() {
		int count = 0;
		for(Seafood s : seafoods) {
			if (s != null) {
				Seafood seaFood = s;
				seafoods[count] = null;
				return seaFood;
			}
			count++;
		}
		return null;
	}
	
	public Seafood[] getSeafoods() {
		return seafoods;
	}
}
