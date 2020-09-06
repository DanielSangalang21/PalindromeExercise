package SeafoodExercise;

public class Crustacean extends Seafood{

	public Crustacean(int size) {
		super(size);
		 Crustacean crustacean = crustaceanFactory(size);
		 this.setSize(crustacean.getSize());
		 this.setName(crustacean.getName());
	}
	
	public Crustacean() {
		this.setName("Shrimp");
		this.setSize(10);
	}
	
	public static Crustacean crustaceanFactory(int size) {
		if(size > 0 && size <= 50) {
			return new Shrimp(size);
		}
		else if (size > 50 && size <= 200) {
			return new Crab(size);
		}
		else {// no need to specify the last expression since we have validated size entries in parent class constructor 
			return new Lobster(size);
		}
	}

}
