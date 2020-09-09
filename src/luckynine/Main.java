package luckynine;

import java.util.Scanner;

import luckynine.TalkingCard.Ranks;
import luckynine.TalkingCard.Suits;

public class Main {
	private static boolean isContinue = true;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (isContinue) {
			System.out.println("Do you want to play again? (yes/no)");
			String response = sc.next();
			System.out.println();
			
			if (response.toLowerCase().equals("yes")) { 
				User user = new User(); 
				Computer computer = new Computer(); 
				TalkingCard userDraw = new TalkingCard(null,null);
				TalkingCard computerDraw = new TalkingCard(null,null);
				  
				LuckyNineGame game = new LuckyNineGame(user,computer,userDraw,computerDraw);
				game.start();

			} else {
				System.out.println("Buh bye!");
				System.exit(0);
			}
		}		
	}
}

