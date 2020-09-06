package SeafoodExercise;

public class SeafoodMain {

	public static void main(String[] args) {
		//create seafood object with fish as seafood type
		Seafood seafood = new Seafood(new Fish(200));
		
		//create Fish object, size as parameter
		Fish fish = new Fish(450);
		
		//create Tilapia object from fish parent class
		Tilapia tilapia = new Tilapia(150);
		
		//create Crustacean object from fish parent class
		Crustacean crustacean = new Crustacean(500);
		
		//create shrimp object from crustacean parent class
		Shrimp shrimp = new Shrimp(28);
		
		//Instantiate basket
		Basket basket = new Basket();
		
		//add all seafoods
		basket.put(seafood);
		basket.put(fish);
		basket.put(tilapia);
		basket.put(crustacean);
		basket.put(shrimp);
		

		//iterate through the seafoods in basket before get method
		System.out.println("---Before Get---");
		for (Seafood s : basket.getSeafoods()) {
			if(s != null) {
				System.out.println("Seafood in basket | name: "+ s.getName() +" _ Size: "+ s.getSize());
			}
			else {
				System.out.println(s);
			}
		}
		
		//put space for readability in console
		System.out.println();
		
		//get the first two seafoods
		Seafood seafood1 = basket.get();
		Seafood seafood2 = basket.get();
		
		//check for the value of obtained seafoods from get method
		System.out.println("Obtained seafood from get method | name: "+ seafood1.getName() +" _ Size: "+ seafood1.getSize());
		System.out.println("Obtained seafood from get method | name: "+ seafood2.getName() +" _ Size: "+ seafood2.getSize());
		
		//put space for readability in console
		System.out.println();
		
		System.out.println("---After Get---");
		//iterate through the seafoods in basket after get method
		for (Seafood s : basket.getSeafoods()) {
			if(s != null) {
				System.out.println("Seafood in basket | name: "+ s.getName() +" _ Size: "+ s.getSize());
			}
			else {
				System.out.println(s);
			}
		}
		
	}

}
