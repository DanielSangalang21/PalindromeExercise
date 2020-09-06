package SeafoodExercise;

public class Tilapia extends Fish {

	private static int min = 51;
	private static int max = 200;
	private static String name = "Tilapia";
	
	public Tilapia(int size) {
		
		if (ValidateSize.validateSize(min, max, size, name) == false) {
			throw new IllegalArgumentException(ValidateSize.errorMessage);
		}
		this.setName(name);
		this.setSize(size);
		// TODO Auto-generated constructor stub
	}

	

}
