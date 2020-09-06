package SeafoodExercise;

public class Seafood implements CookSeafood{

	private int size;

	private String name;
	
	public Seafood(int size) {
		this.setSize(size);
		//this.setName(name);
	}
	
	public Seafood() {
		this.setSize(10);
		this.setName("Anchovy");
	}
	
	public Seafood(Seafood seafood) {
		
		if (seafood instanceof Fish) {
			Fish fish = Fish.fishFactory(seafood.getSize());
			this.size = fish.getSize();
			this.name = fish.getName();
		}
		else {
			Crustacean crustacean = Crustacean.crustaceanFactory(seafood.getSize());
			this.size = crustacean.getSize();
			this.name = crustacean.getName();
		}
	}

	public void cook(int cookType){
		switch(cookType) {
		case 1: System.out.println("Grilled " +name);
				break;
		case 2: System.out.println("Steamed " +name);
				break;
		case 3: System.out.println("Fried " +name);
				break;
		case 4: System.out.println("Boiled " +name);
				break;
		default: System.out.println("Spoiled/Wasted");
		}
	
	}
	
	public int getSize() {
		return size;
	}
	
	public String getName() {
		return name;
	}

	public void setSize(int size) {
		if(size < 1 || size > 500) {
			throw new IllegalArgumentException("Size cannot be less than 1 and greater than 500.");
		}
		this.size = size;
	}

	public void setName(String name) {
		this.name = name;
		
	}
	
}
