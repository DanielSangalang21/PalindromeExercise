package SeafoodExercise;

public class ValidateSize {
public static boolean isTrue = true;
public static String errorMessage = "";

public static boolean validateSize(int min,int max, int size, String name) {
		if (size < min || size > max) {
			errorMessage = name+"'s size cannot be less than "+ min +" and greater than "+ max;
			return false;
		}
		errorMessage = "";
		return true;
	}
}
