package SeafoodExercise;

public class Fish extends Seafood{

	public Fish(int size) {
		super(size);
		Fish fish = fishFactory(size);
		 this.setSize(fish.getSize());
		 this.setName(fish.getName());
	}
	
	public Fish() {
		this.setSize(10);
		this.setName("Anchovy");
	}
	
	public static Fish fishFactory(int size) {
		if(size > 0 && size <= 50) {
			return new Anchovy(size);
		}
		else if (size > 50 && size <= 200) {
			return new Tilapia(size);
		}
		else {// no need to specify the last expression since we have validated size entries in parent class constructor
			return new Tuna(size);
		}
	}

}
