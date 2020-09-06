package SeafoodExercise;

public class Tuna extends Fish{

	private static int min = 201;
	private static int max = 500;
	private static String name = "Tuna";
	
	public Tuna(int size) {
		
		if (ValidateSize.validateSize(min, max, size, name) == false) {
			throw new IllegalArgumentException(ValidateSize.errorMessage);
		}
		this.setName(name);
		this.setSize(size);
	}

}
