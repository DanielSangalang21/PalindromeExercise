package Training;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		testIfPalindrome("Nurses run");
	}
	public static void testIfPalindrome(String original) {
		original = original.replace(" ", "");//removes spaces
		original = original.toLowerCase();//make string lowercase so the bit of each character and the reverse string will be the same
		String reversed ="";
		
		//loops through each character in the original string starting from the end index of string
		// then add each character to reversed variable
		for (int i= original.length()-1; i>=0; i--) {
			reversed += original.charAt(i);
		}
		//check if string is a palindrome
		if(reversed.equals(original)) {
			System.out.println("String is a palindrome!");
		}
		else {
			System.out.println("String is not a palindrome!");
		}
	}
	
}
