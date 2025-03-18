package game;

import java.util.Random;

import java.util.Scanner;

public class Level3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rand = new Random();
		  Scanner a = new Scanner (System.in);

		boolean playAgain = true;
		
		while (playAgain) {
			 int Random = rand.nextInt(21);
	
		System.out.println("Please guess a number from 0 to 20.");
		System.out.println("Please guess my number.");
		
		int Number = a.nextInt();
		int attempts = 1;
		
		while (Number != Random)
		{//START OF WHILE LOOP
			if (Number > 20 || Number < 0)
			{System.out.println("Read the game info, guess the number 0 to 20.");
			System.out.println("Guess again.");
			Number = a.nextInt();}
		
			else {
				if (Number - Random <= 3 && Number - Random >= -3)
				{System.out.println("No!! You got it wrong!! Your number is close to my number.");
				System.out.println("Guess again.");
				Number = a.nextInt();}
				
				else 
			
				{System.out.println("No!! You got it wrong!! Your number is too far to my number.");
				System.out.println("Guess again.");
				Number = a.nextInt();}
			}//END OF ELSE
			attempts++;
		}//END OF WHILE LOOP
			
			if (Random == Number) {
				
			switch (attempts) {
			
			case 1: {System.out.println("Wow, you win at " + attempts + "st time. CONGRATS!");}
			break;
			
			case 2: {System.out.println("Wow, you win at " + attempts + "nd time. CONGRATS!");}
			break;
			
			case 3: {System.out.println("Wow, you win at " + attempts + "rd time. CONGRATS!");}
			break;
			
			default: {System.out.println("Wow, you win at " + attempts + "th time. CONGRATS!");}
			break;
		
		 }//END OF SWITCH ATTEMPTS
		}//END OF IF 	
		 
		 System.out.println("Do you want to play again? (y/n)");
		
		 char Again = a.next().toLowerCase().charAt(0); 
		 
		switch (Again) {//PLAY AGAIN
		
		case 'y': 
		
		playAgain = true;
		break;
		
		case 'n': {System.out.println("Game Ended");}
		break;
		
		default:{System.out.println("Please read the info.");}
		Again = a.next().toLowerCase().charAt(0); 
		break;
		
		}//END OF SWITCH AGAIN
		}//END OF PLAY AGAIN LOOP
		}}

		  



		
		
	


	



