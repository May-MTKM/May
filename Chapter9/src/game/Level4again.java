package game;

import java.util.Random;
import java.util.Scanner;

public class Level4again {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random rand = new Random();
		  Scanner a = new Scanner (System.in);

		  String playAgain;
			
		  do {
			
			System.out.println("Please enter max possible number.");
			
			int MaxPossible = a.nextInt();
			 int Random = rand.nextInt(MaxPossible + 1);
	
		System.out.println("Please guess a number from 0 to " + MaxPossible + ".");
		System.out.println("Please guess my number.");
		
		int Number = a.nextInt();
		int attempts = 1;
		
		while (Number != Random)
		{
			if (Number > MaxPossible || Number < 0)
			{System.out.println("Read the game info, guess the number between 0 and " + MaxPossible + ".");
			System.out.println("Guess again.");
			Number = a.nextInt();
			}
		
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
			 
			 playAgain = a.next().toLowerCase();
			
			 
			 } while (playAgain.equals("y"));//END OF PLAY AGAIN LOOP
			  {System.out.println("Game Ended");}
			  
			}}
