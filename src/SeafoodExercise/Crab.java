package SeafoodExercise;

public class Crab extends Crustacean{
	
	private static int min = 51;
	private static int max = 200;
	private static String name = "Crab";
	
	public Crab(int size) {
		
		if (ValidateSize.validateSize(min, max, size, name) == false) {
			throw new IllegalArgumentException(ValidateSize.errorMessage);
		}
		this.setName(name);
		this.setSize(size);
	}

}
