package luckynine;

import java.util.Scanner;

public class LuckyNineGame {
	private static TalkingCard[][] talkingCards;
	private static User user; 
	private static Computer computer; 
	private static TalkingCard userDraw;
	private static TalkingCard computerDraw;
	private static int userScore = 0;
	private static int computerScore = 0;
	private static Scanner sc;
	
	public LuckyNineGame(TalkingCard[][] talkingCards, User user,
			Computer computer, TalkingCard userDraw, TalkingCard computerDraw) {
		this.talkingCards=talkingCards;
		this.user =user;
		this.computer = computer;
		this.userDraw = userDraw;
		this.computerDraw = computerDraw;
	}
	
	public void Start() {
		while(user.getNoOfDraws() != 0)
		{
			computerDraw();
			if (user.getNoOfDraws() == 1) {
				
				sc = new Scanner(System.in);
				System.out.println("You have one last draw...");
				System.out.println("Do you want to deal? (yes/no)");
				String answer = sc.next();
				
				if (answer.toLowerCase().equals("no")) {
					userDraw();
				}
				else {
					break;
				}
			}
			else {
				userDraw();
			}
		}
		String message = gameDeal();
		showBothCardsInHand();
		System.out.println(message);
		
		System.out.println();
		//System.out.println("--The Deck After The Game--");
		//TalkingCard.displayDeck(talkingCards);
	}
	
	private void computerDraw() {
		  System.out.println();
		  computerDraw = computer.drawCard(talkingCards);
		  computer.getHand().addCardToHand(computerDraw);
		  System.out.println("Computer had drawn a card");
		  System.out.println("Computer has/have "+computer.getNoOfDraws()+" draw(s) remaining");
		  System.out.println();
		  
	}
	
	private void userDraw() {
		  System.out.println();
		  System.out.println("Your turn");
		  System.out.println();
		  userDraw = user.drawCard(talkingCards);
		  user.getHand().addCardToHand(userDraw);
		  System.out.println("You have drawn "+userDraw.getRank() + " OF " + userDraw.getSuit());
		  System.out.println("Your new set of card(s) is..."); 
		  user.showCardsInHands();
		  System.out.println("You have "+user.getNoOfDraws()+" draw(s) remaining");
		  System.out.println();
		  
		  System.out.println("Press enter to continue...");
		  sc = new Scanner(System.in);
		  sc.nextLine();	  
	}
	
	private void showBothCardsInHand() {
		System.out.println();
		System.out.println("----------USER CARDS----------");
		user.showCardsInHands();
		System.out.println("----------USER SCORE----------");
		System.out.println(userScore);
		System.out.println();
		System.out.println("---------COMPUTER CARDS----------");
		computer.showCardsInHands();
		System.out.println("---------COMPUTER SCORE----------");
		System.out.println(computerScore);
		System.out.println();
	}
	
	private String gameDeal() {
		String message="";
		TalkingCard[] userCards = user.getHand().getCard();
		TalkingCard[] computerCards= computer.getHand().getCard();
		
		userScore = user.deal(userCards, user.getNoOfDraws());
		computerScore = computer.deal(computerCards, computer.getNoOfDraws());
		
		if (userScore > computerScore)
		{
			message = "You win!";
		}
		else if(userScore < computerScore)
		{
			message = "Computer wins!";
		}
		
		else if (user.getNoOfDraws() > computer.getNoOfDraws()){
			message = "You Win!";
		}
		
		else
		{
			message = "Draw!";
		}
		return message;
	}
		
}
