package SeafoodExercise;

public class Shrimp extends Crustacean{

	private static int min = 1;
	private static int max = 50;
	private static String name = "Shrimp";
	
	public Shrimp(int size) {
		
		if (ValidateSize.validateSize(min, max, size, name) == false) {
			throw new IllegalArgumentException(ValidateSize.errorMessage);
		}
		this.setName(name);
		this.setSize(size);
		// TODO Auto-generated constructor stub
	}

}
