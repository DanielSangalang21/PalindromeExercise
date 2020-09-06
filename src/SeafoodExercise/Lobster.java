package SeafoodExercise;

public class Lobster extends Crustacean{

	private static int min = 201;
	private static int max = 500;
	private static String name = "Lobster";
	
	public Lobster(int size) {
		
		if (ValidateSize.validateSize(min, max, size, name) == false) {
			throw new IllegalArgumentException(ValidateSize.errorMessage);
		}
		this.setName(name);
		this.setSize(size);
		// TODO Auto-generated constructor stub
	}

}
